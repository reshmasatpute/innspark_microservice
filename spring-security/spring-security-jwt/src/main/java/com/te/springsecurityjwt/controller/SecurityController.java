package com.te.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/welcome")
	public String welcome() {
		String text = "This is private page only authorize person can access this page";
		
		return text;

	}
}
