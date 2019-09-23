package com.example.demo.user.service;

import org.springframework.stereotype.Service;

import com.example.demo.user.entity.User;

@Service
public interface UserService {
	User findById(Integer id);
}
