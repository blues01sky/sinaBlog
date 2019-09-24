package com.example.demo.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
<<<<<<< HEAD
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="navications")
public class IndexNavication {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // MYSQL时可以这样使用自增
	private Integer id;
	private String navication;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
=======
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="navications")
public class IndexNavication {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // MYSQL时可以这样使用自增
	private int id;
	private String navication;
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
>>>>>>> branch 'master' of https://github.com/blues01sky/sinaBlog.git
		this.id = id;
	}
	public String getNavication() {
		return navication;
	}
	public void setNavication(String navication) {
		this.navication = navication;
	}
	@Override
	public String toString() {
		return "IndexNavication [id=" + id + ", navication=" + navication + "]";
	}
	
}
