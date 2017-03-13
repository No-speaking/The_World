package com.oracle.erp.stock.service;

import java.util.List;

import com.oracle.erp.stock.model.ContactModel;

public interface IContactService {
	public void add(ContactModel cm) throws Exception;
	public void modify(ContactModel cm) throws Exception;
	public void delete(ContactModel cm) throws Exception;
	public ContactModel getContact(int did) throws Exception;
	public List<ContactModel> getList() throws Exception;
}
