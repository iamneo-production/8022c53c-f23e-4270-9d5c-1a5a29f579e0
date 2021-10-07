package com.examly.springapp;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="booking")
public class BookingModel {
    @Id
    @GeneratedValue


	@Column(columnDefinition = "varchar(255) not null unique")
	private String bookingId;
	
	@Column(columnDefinition = "varchar(255) FOREIGN KEY REFERENCES user(email)")
	private String clientDetail;
	
	@Column(columnDefinition = "varchar(255) FOREIGN KEY REFERENCES trainer(traineremail)")
	private String TrainerDetail;
	
	@Column(columnDefinition = "varchar(255) not null")
	private String lawfirmname;

    @Column(columnDefinition = "DATE not null")
	private Date date;

    @Column(columnDefinition = "varchar(255) not null")
	private String amount;
	
	@Column(columnDefinition = "boolean defaulfalse")
	private Boolean bookingStatus;
	
	
	
	public BookingModel() {
		
	}

	public BookingModel(String bookingId, String clientDetail, String TrainerDetail, String lawfirmname,Date date, String amount,Boolean bookingStatus) {
		this.bookingId = bookingId;
		this.clientDetail = clientDetail;
		this.TrainerDetail = TrainerDetail;
		this.lawfirmname = lawfirmname;
		this.date = date;
		this.amount = amount;
		this.bookingStatus = bookingStatus;
	}


	public String getbookingId() {
		return bookingId;
	}

	public void setbookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getclientDetail() {
		return clientDetail;
	}

	public void setclientDetail(String clientDetail) {
		this.clientDetail = clientDetail;
	}

	public String getTrainerDetail() {
		return TrainerDetail;
	}

	public void setTrainerDetail(String TrainerDetail) {
		this.TrainerDetail = TrainerDetail;
	}

	public String getlawfirmname() {
		return lawfirmname;
	}

	public void setlawfirmname(String lawfirmname) {
		this.lawfirmname = lawfirmname;
	}

    public String getamount() {
		return amount;
	}

	public void setamount(String amount) {
		this.amount = amount;
	}

	public Boolean getbookingStatus() {
		return bookingStatus;
	}

	public void setbookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Date getdate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}


