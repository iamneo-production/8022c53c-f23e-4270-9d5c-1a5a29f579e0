package com.examly.springapp;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.sql.Date;

@Entity
@Table(name="report")
public class ReportModel {
    
	@Id
	@Column(name="reportId" , columnDefinition = "varchar(255) not null unique")
	private String reportId;
	
	@Column(name="appointmentdetail" , columnDefinition = "varchar(255) FOREIGN KEY REFERENCES appointment(appointmentId)")
	private String appointmentdetail;

    @Column(name="Date" , columnDefinition = "DATE not null")
	private Date date;

    @Column(name="Days" , columnDefinition = "int not null")
	private int days;

    @Column(name="reportdesc" , columnDefinition = "varchar(255) not null")
	private String report;
	
	@Column(name="issuedby" , columnDefinition = "varchar(255) FOREIGN KEY REFERENCES trainer(traineremail)")
	private String issuedby;
	
	
	
	public ReportModel() {
		
	}

	public ReportModel(String reportId, String appointmentdetail,Date date,int days,String report ,String issuedby) {
		this.reportId = reportId;
		this.appointmentdetail = appointmentdetail;
		this.date = date;
        this.days = days;
		this.report = report;
		this.issuedby = issuedby;
	}


	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getAppointmentDetail() {
		return appointmentdetail;
	}

	public void setAppointmentDetail(String appointmentdetail) {
		this.appointmentdetail = appointmentdetail;
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
    public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
    public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
}

    

