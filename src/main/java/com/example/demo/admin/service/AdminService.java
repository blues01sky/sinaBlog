package com.example.demo.admin.service;

import org.springframework.stereotype.Service;

import com.example.demo.admin.entity.Admin;

@Service
public interface AdminService {
	Admin findById(Integer id);
	
	Integer addAdmin(String name,String password);
	
	Integer deleteAdmin(String name,String password);
	
	Integer adminDeleteAdmin(Integer id);
	
	Integer updateAdmin(String newname,String password,String name);
	
}
