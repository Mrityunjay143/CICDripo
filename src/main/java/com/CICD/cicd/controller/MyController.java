package com.CICD.cicd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "Home Insureance RestApi!";
	}

}
