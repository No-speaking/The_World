package com.oracle.erp.stock.service.impl;

import java.util.List;

import com.oracle.erp.stock.dao.IContactDao;
import com.oracle.erp.stock.dao.IOrdersDao;
import com.oracle.erp.stock.factory.DaoFactory;
import com.oracle.erp.stock.model.ContactModel;
import com.oracle.erp.stock.service.IContactService;

public class ContactServiceImpl implements IContactService {

	@Override
	public void add(ContactModel cm) throws Exception {
		// TODO Auto-generated method stub
		IContactDao dd=DaoFactory.createContactDao();
		dd.create(cm);
	}

	@Override
	public void modify(ContactModel cm) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ContactModel cm) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public ContactModel getContact(int did) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactModel> getList() throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createContactDao().getList();
	}

}
