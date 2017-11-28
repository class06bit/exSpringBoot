package com.hb.domain.model.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GuestVo {

	@Id
	@GeneratedValue
	private int sabun;
	
	private String name;
	
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
