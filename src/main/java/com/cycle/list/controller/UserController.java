package com.cycle.list.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/b2b")
public class UserController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Waiting";
	}

}
