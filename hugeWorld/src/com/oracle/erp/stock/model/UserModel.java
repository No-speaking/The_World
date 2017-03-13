package com.oracle.erp.stock.model;

import java.sql.Blob;
import java.util.Date;

public class UserModel {
	private String password=null;
	private String name=null;
	private Blob photo=null;
	private String phototype=null;
	private String filename=null;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getPhototype() {
		return phototype;
	}
	public void setPhototype(String phototype) {
		this.phototype = phototype;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
