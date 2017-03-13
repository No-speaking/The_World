package com.oracle.erp.stock.service.impl;

import java.util.List;

import com.oracle.erp.stock.dao.ISubsDao;
import com.oracle.erp.stock.dao.IUserDao;
import com.oracle.erp.stock.factory.DaoFactory;
import com.oracle.erp.stock.model.SubsModel;
import com.oracle.erp.stock.service.ISubsService;

public class SubsServiceImpl implements ISubsService {

	@Override
	public void add(SubsModel sm) throws Exception {
		// TODO Auto-generated method stub
		ISubsDao dd=DaoFactory.createSubsDao();
		dd.create(sm);
	}

	@Override
	public void modify(SubsModel sm) throws Exception {
		// TODO Auto-generated method stub
		ISubsDao dd=DaoFactory.createSubsDao();
		dd.update(sm);
	}

	@Override
	public void delete(SubsModel sm) throws Exception {
		// TODO Auto-generated method stub
		ISubsDao dd=DaoFactory.createSubsDao();
		dd.delete(sm);
	}

	@Override
	public SubsModel getSubs(String sname) throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createSubsDao().getSubs(sname);
	}

	@Override
	public List<SubsModel> getList() throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createSubsDao().getList();
	}

}
