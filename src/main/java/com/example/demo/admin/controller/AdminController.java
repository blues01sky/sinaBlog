package com.example.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="admin",method = RequestMethod.GET)
public class AdminController {
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String get() {
		
		return "web/hello";
	}
}
