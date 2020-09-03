package com.github.mateuszwlosek.hystrix;

import com.github.mateuszwlosek.hystrix.helloworld.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

	private final HelloWorldService helloWorldService;

	@GetMapping("/test")
	public String test() {
		return helloWorldService.getHelloWorld();
	}
}
