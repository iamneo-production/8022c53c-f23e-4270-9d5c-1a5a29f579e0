package com.examly.springapp;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.sql.Date;
import java.util.*;
import java.nio.charset.*;


@Entity
@Table(name="booking")
public class BookingModel {
    
	@Id
	@Column(name="bookingId" , columnDefinition = "varchar(255) not null unique")
	private String bookingId;
	
	@Column(name="clientDetail" , columnDefinition = "varchar(255) FOREIGN KEY REFERENCES users(email)")
	private String clientDetail;
	
	@Column(name="TrainerDetail" , columnDefinition = "varchar(255) FOREIGN KEY REFERENCES trainer(traineremail)")
	private String TrainerDetail;
	
	@Column(name="lawfirmname" , columnDefinition = "varchar(255) not null")
	private String lawfirmname;

    @Column(name="date" , columnDefinition = "DATE not null")
	private Date date;

    @Column(name="amount" , columnDefinition = "int not null default 0")
	private int amount;
	
	@Column(name="bookingStatus" , columnDefinition = "boolean default false")
	private Boolean bookingStatus;

	public BookingModel() {
		
	}
	public BookingModel(String bookingId , String clientDetail, String TrainerDetail, String lawfirmname, Date date,
			int amount, Boolean bookingStatus) {
		this.bookingId=bookingId;
		this.clientDetail = clientDetail;
		this.TrainerDetail = TrainerDetail;
		this.lawfirmname = lawfirmname;
		this.date = date;
		this.amount = amount;
		this.bookingStatus = bookingStatus;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getClientDetail() {
		return clientDetail;
	}
	public void setClientDetail(String clientDetail) {
		this.clientDetail = clientDetail;
	}
	public String getTrainerDetail() {
		return TrainerDetail;
	}
	public void setTrainerDetail(String trainerDetail) {
		TrainerDetail = trainerDetail;
	}
	public String getLawfirmname() {
		return lawfirmname;
	}
	public void setLawfirmname(String lawfirmname) {
		this.lawfirmname = lawfirmname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Boolean getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	/*static String getAlphaNumericString(){
  
        byte[] array = new byte[256];
        new Random().nextBytes(array);
  
        return new String(array, Charset.forName("UTF-8"));
	}*/
}


