package io.tutorial.spring.garageApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {
	
	@RequestMapping("/hello")
	public String sayheloo() {
		return "Hello !";
	}

}
