package com.examly.springapp;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="appointment")
public class AppointmentModel {
    @Id
    @GeneratedValue


	@Column(columnDefinition = "varchar(255) not null unique")
	private String appointmentId;
	
	@Column(columnDefinition = "varchar(255) FOREIGN KEY REFERENCES user(email)")
	private String userId;

    @Column(columnDefinition = "DATE not null")
	private Date date;
	
	@Column(columnDefinition = "varchar(255) FOREIGN KEY REFERENCES user(email)")
	private String issuedby;
	
	
	
	public AppointmentModel() {
		
	}

	public AppointmentModel(String appointmentId, String userId,Date date, String issuedby) {
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.date = date;
		this.issuedby = issuedby;
	}


	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
    public String getIssuedBy() {
		return issuedby;
	}

	public void setIssuedBy(String issuedby) {
		this.issuedby = issuedby;
	}

	public Date getdate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
