package com.hb.domain.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//#    jpa:
//#        database: H2
//#    datasource:
//#        url: jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
//#        username: sa
//#        password: 
//#        driverClassName: org.h2.Driver
@Entity
public class GuestVo {

	@Id
	@GeneratedValue
	private int sabun;
	
	@Column(columnDefinition = "varchar2")
	private String name;
	
	@Column(columnDefinition = "date")
	private Date nalja;
	
	private int pay;

	public int getSabun() {
		return sabun;
	}

	public String getName() {
		return name;
	}

	public Date getNalja() {
		return nalja;
	}

	public int getPay() {
		return pay;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
