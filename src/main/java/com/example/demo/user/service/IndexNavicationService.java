package com.example.demo.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.user.entity.IndexNavication;

@Service
public interface IndexNavicationService{
	Integer addNavication(String navication);
	
	Integer delNavication(String navication);
	
	List<IndexNavication> findAll();
}
