package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String home() {
		return "Hello Home!";
	}
	
	@GetMapping("/secure")
	public String SecureHome() {
		return "hello home secure!";
	}
}
