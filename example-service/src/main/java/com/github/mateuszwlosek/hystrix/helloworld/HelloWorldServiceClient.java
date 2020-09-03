package com.github.mateuszwlosek.hystrix.helloworld;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hello-world-service", url = "http://hello-world-service:8080", fallback = HelloWorldServiceClientFallback.class)
interface HelloWorldServiceClient {

	@GetMapping("hello-world")
	String getHelloWorld();
}
