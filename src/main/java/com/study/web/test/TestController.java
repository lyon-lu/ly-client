package com.study.web.test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date May 24, 2018 4:43:57 PM
 *
 * </pre>
 */
@Controller
public class TestController {
	
	@Resource
	private TestClient testClient;
	
	@RequestMapping(value = "test")
	public String test(){
		String test = testClient.test();
		System.out.println(test);
		return "index";
	}
	
	@RequestMapping(value = "gateway")
	@ResponseBody
	public String gateway(){
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println("gateway------------"+request.getRemoteAddr());
		return "hello";
	}
}
