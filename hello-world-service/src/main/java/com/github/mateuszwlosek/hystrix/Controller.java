package com.github.mateuszwlosek.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("hello-world")
	public String helloWorld() {
		return "hello world from hello-world service";
	}
}
