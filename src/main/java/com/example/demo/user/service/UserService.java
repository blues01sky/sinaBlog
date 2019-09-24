package com.example.demo.user.service;

import org.springframework.stereotype.Service;

import com.example.demo.user.entity.User;

@Service
public interface UserService {
	User findById(Integer id);
<<<<<<< HEAD
=======
	
	Integer addUser(String name,String password);
	
	Integer deleteUser(String name,String password);
	
	Integer adminDeleteUser(Integer id);
	
	Integer updateUser(String newname,String password,String name);
	
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
}
