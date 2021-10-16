package com.examly.springapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Entity
@Table(name="users")
public class UserModel {
	
	

	@Id
	@Column(columnDefinition = "varchar(255) not null unique")
	private String email;

	@Column(columnDefinition = "varchar(255) not null")
	private String password;
	
	@Column(columnDefinition = "varchar(255) not null")
	private String username;
	
	@Column(columnDefinition = "varchar(10) not null")
	private String mobilenumber;
	
	@Column(columnDefinition = "boolean default false")
	private Boolean active;
	
	@Column(columnDefinition = "varchar(255) not null")
	private String role;

	public UserModel() {
		
	}
	
	public UserModel(String email, String password, String username, String mobilenumber, Boolean active, String role) {
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobilenumber = mobilenumber;
		this.active = active;
		this.role = role;
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

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getMobileNumber() {
		return mobilenumber;
	}

	public void setMobileNumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
