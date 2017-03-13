package com.oracle.erp.stock.model;

import java.util.Date;

public class DreamModel {
	private String dname=null;
	private String wantto=null;
	private double price=0;
	private int num=0;
	private int did=0;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getWantto() {
		return wantto;
	}
	public void setWantto(String wantto) {
		this.wantto = wantto;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
