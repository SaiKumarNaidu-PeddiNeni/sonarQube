package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {

	@GetMapping(value="/string")
	public String demo()
	{
		return "welcome to STS";
	}
	
}
