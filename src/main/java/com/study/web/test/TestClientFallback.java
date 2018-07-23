package com.study.web.test;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date May 24, 2018 4:43:44 PM
 *
 * </pre>
 */
@Component
public class TestClientFallback implements TestClient{

	@Override
	public String test() {
		System.out.println("test fallback-----------------");
		return null;
	}

}
