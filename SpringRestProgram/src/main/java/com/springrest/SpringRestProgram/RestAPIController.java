package com.springrest.SpringRestProgram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestAPIController {

	public RestAPIController() {
		super();
		System.out.println("Rest API Controller initialized");
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Priyanka";
	}

}

