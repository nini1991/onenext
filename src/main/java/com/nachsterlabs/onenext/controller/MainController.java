package com.nachsterlabs.onenext.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String Index() {
		return "Testing";
		
	}
	

}
