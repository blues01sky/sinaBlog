package com.example.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public String admin() {
		return "web/hello";
	}
	
	@RequestMapping(value="/regist",method = RequestMethod.GET)
	public String userHome() {
		System.out.println("Sdf");
		return "web/user/regist";
	}
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String textDetial() {
		System.out.println("Sdf");
		return "web/user/home";
	}
	@RequestMapping(value="/textDetial",method = RequestMethod.GET)
	public String userRegist() {
		System.out.println("Sdf");
		return "web/user/textDetial";
	}
	
}
