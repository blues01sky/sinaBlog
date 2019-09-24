package com.example.demo.user.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import com.example.demo.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findById(Integer id) {
		return userRepository.findById(id);
	}
<<<<<<< HEAD
	
=======

	@Override
	public Integer addUser(String name, String password) {
		// TODO Auto-generated method stub
		return userRepository.addUser(name, password);
	}

	@Override
	public Integer deleteUser(String name, String password) {
		// TODO Auto-generated method stub
		return userRepository.deleteUser(name, password);
	}

	@Override
	public Integer adminDeleteUser(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.adminDeleteUser(id);
	}

	@Override
	public Integer updateUser(String newname, String password, String name) {
		// TODO Auto-generated method stub
		return userRepository.updateUser(newname, password, name);
	}
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
}
