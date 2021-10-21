package com.examly.springapp;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="users")
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;


	@Column(columnDefinition = "varchar(255) not null unique")
	private String email;
	
	@Column(columnDefinition = "varchar(255) not null")
	private String password;
	
	@Column(columnDefinition = "varchar(255) not null")
	private String usename;
	
	@Column(columnDefinition = "varchar(10) not null")
	private String mobileNumber;
	
	@Column(columnDefinition = "boolean default false")
	private Boolean active;
	
	@Column(columnDefinition = "varchar(255) not null")
	private String role;
	
	public UserModel() {
		
	}

	public UserModel(Long id, String email, String password, String usename, String mobileNumber, Boolean active,
			String role) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.usename = usename;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUsename() {
		return usename;
	}

	public void setUsename(String usename) {
		this.usename = usename;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
