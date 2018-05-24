package com.study.client.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * Description:
 * 
 * @author Lyon Lu
 * @date May 24, 2018 4:43:35 PM
 *
 * </pre>
 */
@FeignClient(name = "LY-SERVER", fallback = TestClientFallback.class)
public interface TestClient {
	
	@RequestMapping(value = "test")
	String test();
}
