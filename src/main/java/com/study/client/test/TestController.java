package com.study.client.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
