package com.example.demo.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldApi {
	@RequestMapping("/hello")
	public String SayHello() {
		System.out.println("hello world");
		return "SpringBoot HelloworldApi";
	}

	@RequestMapping("/hi")
	public String SayHello1() {
		System.out.println("hello world");
		return "SpringBoot lancesoft";
	}
}
