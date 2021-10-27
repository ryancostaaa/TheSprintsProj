package com.maansi.cs490.Newsapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserModel {
	public String userName;
	public String name;
	public String email;
	public String password;
	
	@Id
	  @GeneratedValue
	  private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public UserModel(String userName, String name, String email, String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public UserModel(String userName,String password) {
		super();
		this.userName = userName;
		this.password = password; 
	}
	
	
	public UserModel() {
		this.userName = "";
		this.name = "";
		this.email = "";
		this.password = "";
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
