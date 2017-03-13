package com.oracle.erp.stock.dao;

import java.util.List;

import com.oracle.erp.stock.model.ContactModel;

public interface IContactDao {
	public void create(ContactModel cm) throws Exception;
	 public void update(ContactModel cm) throws Exception;
	 public void delete(ContactModel cm) throws Exception;
	 public ContactModel getContact(int cid) throws Exception;
	 public List<ContactModel> getList() throws Exception;
}
