package com.example.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.in.service.LoginService;

@Controller
@SessionAttributes("username")
public class LoginController {
	
	@Autowired private LoginService loginService;
	
	
	@RequestMapping(value = "/log", method = RequestMethod.GET)
	//@GetMapping("/login")
	public String showLoginPage(ModelMap map) {
		return "welcome";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String showWelcomePage(ModelMap map,@RequestParam String username,@RequestParam String password) {
		
		if(!loginService.validateUser(username, password)) {
			map.put("Invalideuser", "Not a Valide User");
			return loginService.login();
		}
		
		map.put("userName",username);
		map.put("psaaword",password);
		return "welcome";
		
	}

}
