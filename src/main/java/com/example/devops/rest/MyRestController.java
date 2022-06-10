package com.example.devops.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springApp")
public class MyRestController {
	
	@RequestMapping("/hi")
	public String sayHello() {
		return " Welcome To Devops with AWS Practice............";
	}

}
