package com.sachin.example.springbootterraformpoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/first/app")
	public String test() {
		return "This is my first application";
	}

	@GetMapping("/ping")
	public String pong() {
		return "Ping Pong";
	}

}
