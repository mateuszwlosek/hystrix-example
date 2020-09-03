package com.github.mateuszwlosek.hystrix.helloworld;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class HelloWorldService {

	private final HelloWorldServiceClient client;

	public String getHelloWorld() {
		log.info("Requesting hello-world service...");
		return client.getHelloWorld();
	}
}
