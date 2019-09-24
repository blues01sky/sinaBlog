package com.example.demo.admin.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.admin.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Admin> {
	Admin findById(Integer id);
	
	@Transactional
	@Modifying
	@Query(value = "insert into admin(adminname,password) values(?1,?2)",nativeQuery = true)
	Integer addAdmin(String adminname,String password);
	
	@Transactional
	@Modifying
	@Query(value = "delete from admin where adminname = ?1 and password = ?2",nativeQuery = true)
	Integer deleteAdmin(String adminname,String password);
	
	@Transactional
	@Modifying
	@Query(value = "delete from admin where id = ?1",nativeQuery = true)
	Integer adminDeleteAdmin(Integer id);
	
	@Transactional
	@Modifying
	@Query(value = "update admin set adminname = ?1,password = ?2 where adminname = ?3",nativeQuery = true)
	Integer updateAdmin(String newadminname,String password,String adminname);
	
	
}
