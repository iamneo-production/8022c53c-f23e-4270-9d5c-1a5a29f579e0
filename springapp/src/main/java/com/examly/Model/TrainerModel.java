package com.examly.springapp;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="trainer")
public class TrainerModel {
   

    @Column(columnDefinition = "varchar(255) not null")
    private String trainername;

	@Id
    @Column(columnDefinition = "varchar(255) not null unique")
    private String traineremail;

    @Column(columnDefinition = "int default 0")
	private int trainerexp;

    @Column(columnDefinition = "varchar(255) not null")
    private String shopname;

    @Column(columnDefinition = "varchar(255) not null")
    private String password;
	
	public TrainerModel() {
		
	}

	public TrainerModel(String trainername,String traineremail,int trainerexp,String shopname,String password) {
		this.trainername = trainername;
		this.traineremail = traineremail;
		this.trainerexp = trainerexp;
		this.shopname = shopname;
		this.password = password;
	}

	public String getTrainerName() {
		return trainername;
	}

	public void setTrainerName(String trainername) {
		this.trainername = trainername;
	}

	public String getTrainerEmail() {
		return traineremail;
	}

	public void setTrainerEmail(String traineremail) {
		this.traineremail = traineremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShopName() {
		return shopname;
	}

	public void setShopName(String shopname) {
		this.shopname = shopname;
	}

	public int getTrainerExp() {
		return trainerexp;
	}

	public void setTrainerExp(int trainerexp) {
		this.trainerexp = trainerexp;
	}
}

