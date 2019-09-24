package com.example.demo.user.service;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

@Service
public interface IndexNavicationService{
	
=======
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.user.entity.IndexNavication;

@Service
public interface IndexNavicationService{
	Integer addNavication(String navication);
	
	Integer delNavication(String navication);
	
	List<IndexNavication> findAll();
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
}
