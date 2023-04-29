package com.bike.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class BikeDemo {

	
	@Id
	private int sno;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getBmodel() {
		return bmodel;
	}
	public void setBmodel(String bmodel) {
		this.bmodel = bmodel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String bmodel;
	private int price;
}

