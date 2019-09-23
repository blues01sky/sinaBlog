package com.example.demo.user.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, User> {
	User findById(Integer id);
	
	@Transactional
	@Modifying
	@Query(value = "insert into user(name,password) values(?1,?2)",nativeQuery = true)
	Integer addUser(String name,String password);
	
	@Transactional
	@Modifying
	@Query(value = "delete from user where name = ?1 and password = ?2",nativeQuery = true)
	Integer deleteUser(String name,String password);
	
	@Transactional
	@Modifying
	@Query(value = "delete from user where id = ?1",nativeQuery = true)
	Integer adminDeleteUser(Integer id);
	
	@Transactional
	@Modifying
	@Query(value = "update user set name = ?1,password = ?2 where name = ?3",nativeQuery = true)
	Integer updateUser(String newname,String password,String name);
	
	
}
