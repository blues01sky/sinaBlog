package com.example.demo.admin.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.admin.entity.Admin;
import com.example.demo.admin.repository.AdminRepository;
import com.example.demo.admin.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin findById(Integer id) {
		return adminRepository.findById(id);
	}

	@Override
	public Integer addAdmin(String adminname, String password) {
		// TODO Auto-generated method stub
		return adminRepository.addAdmin(adminname, password);
	}

	@Override
	public Integer deleteAdmin(String adminname, String password) {
		// TODO Auto-generated method stub
		return adminRepository.deleteAdmin(adminname, password);
	}

	@Override
	public Integer adminDeleteAdmin(Integer id) {
		// TODO Auto-generated method stub
		return adminRepository.adminDeleteAdmin(id);
	}

	@Override
	public Integer updateAdmin(String newadminname, String password, String adminname) {
		// TODO Auto-generated method stub
		return adminRepository.updateAdmin(newadminname, password, adminname);
	}
}
