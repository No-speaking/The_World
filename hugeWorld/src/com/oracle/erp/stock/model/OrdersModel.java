package com.oracle.erp.stock.model;

import java.util.Date;

public class OrdersModel {
	private int id=0;
	
	private String pname=null;
	private Date strdate=null;
	private Date enddate=null;
	private String place=null;
	private int count=0;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getStrdate() {
		return strdate;
	}
	public void setStrdate(Date strdate) {
		this.strdate = strdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
