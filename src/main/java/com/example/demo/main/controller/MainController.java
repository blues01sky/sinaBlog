package com.example.demo.main.controller;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
=======
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.user.entity.IndexNavication;
import com.example.demo.user.repository.IndexNavicationRepository;

@Controller
public class MainController {
	@Autowired
	private IndexNavicationRepository indexNavicationRepository;
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
		
		List<IndexNavication> navications= indexNavicationRepository.findAll();
		System.out.println(navications);
		request.setAttribute("navications", navications);
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
        return "/web/index";
    }
}
