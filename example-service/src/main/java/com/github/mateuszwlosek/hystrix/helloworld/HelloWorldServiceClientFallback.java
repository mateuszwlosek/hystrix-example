package com.github.mateuszwlosek.hystrix.helloworld;

import org.springframework.stereotype.Component;

@Component
class HelloWorldServiceClientFallback implements HelloWorldServiceClient {

	private static final String HELLO_WORLD_PLACEHOLDER = "hello world from example-service";

	@Override
	public String getHelloWorld() {
		return HELLO_WORLD_PLACEHOLDER;
	}
}
