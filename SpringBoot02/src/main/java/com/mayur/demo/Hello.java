package com.mayur.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/")
	public String greed() {
		return "Hello Welcome to SB application ";
	}
}
