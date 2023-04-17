package com.spr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/MyLogin")
	public String showLoginPage() {

		return "login-page";
	}

	@PostMapping("proccess-login")
	public String processLogin() {

		return "redirect:homePage";
	}
}
