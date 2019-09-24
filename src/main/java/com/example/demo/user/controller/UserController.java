package com.example.demo.user.controller;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.user.entity.User;
import com.example.demo.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/find",method = RequestMethod.GET)
	public String findbyid(HttpServletRequest request) {
		User user = userService.findById(1);
		request.setAttribute("user",user);
		System.out.println(user);
=======
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
	
	
	@RequestMapping(value="/find",method = RequestMethod.GET)
	public String findbyid() {
		
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
		return "web/hello";
	}
}
