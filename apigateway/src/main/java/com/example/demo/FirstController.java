package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to FirstService";
	}
	

}