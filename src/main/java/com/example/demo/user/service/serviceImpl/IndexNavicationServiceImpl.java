package com.example.demo.user.service.serviceImpl;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.example.demo.user.service.IndexNavicationService;

@Service
public class IndexNavicationServiceImpl implements IndexNavicationService {
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.entity.IndexNavication;
import com.example.demo.user.repository.IndexNavicationRepository;
import com.example.demo.user.service.IndexNavicationService;

@Service
public class IndexNavicationServiceImpl implements IndexNavicationService {

	@Autowired
	private IndexNavicationRepository indexNavicationRepository;
	@Override
	public Integer addNavication(String navication) {
		// TODO Auto-generated method stub
		return indexNavicationRepository.addNavication(navication);
	}

	@Override
	public Integer delNavication(String navication) {
		// TODO Auto-generated method stub
		return indexNavicationRepository.delNavication(navication);
	}

	@Override
	public List<IndexNavication> findAll() {
		// TODO Auto-generated method stub
		return indexNavicationRepository.findAll();
	}
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
	
}
