package com.ctu.doc.sys.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String root() {
		return "login";
	}
	
	@RequestMapping(value= "index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value= "main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "admin/user/register/register";
	}

}
