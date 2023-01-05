package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkinscontroller {

	@GetMapping("hello")
	public String sayHello() {
		return "Hello Developer, you are awesome!";
	}
}
