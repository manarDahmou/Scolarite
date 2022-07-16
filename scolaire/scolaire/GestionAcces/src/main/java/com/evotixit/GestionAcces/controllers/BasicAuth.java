package com.evotixit.GestionAcces.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotixit.GestionAcces.models.AuthBean;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/users")
public class BasicAuth {

	@GetMapping("/basic-auth")
	public AuthBean hello() {
		return new AuthBean("You are autheticated");
	}
}
