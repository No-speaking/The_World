package com.oracle.erp.stock.service.impl;

import java.util.List;

import com.oracle.erp.stock.dao.IOrdersDao;
import com.oracle.erp.stock.dao.IUserDao;
import com.oracle.erp.stock.factory.DaoFactory;
import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.UserModel;
import com.oracle.erp.stock.service.IUserService;

public class UserServiceImpl implements IUserService {



	@Override
	public void add(UserModel um) throws Exception {
		// TODO Auto-generated method stub
		IUserDao dd=DaoFactory.createUserDao();
		dd.create(um);
	}

	@Override
	public void modify(UserModel um) throws Exception {
		// TODO Auto-generated method stub
		IUserDao dd=DaoFactory.createUserDao();
		dd.update(um);
	}

	@Override
	public void delete(UserModel um) throws Exception {
		// TODO Auto-generated method stub
		IUserDao dd=DaoFactory.createUserDao();
		dd.delete(um);
	}

	@Override
	public UserModel getUser(String name) throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createUserDao().getUser(name);
	}

	@Override
	public List<UserModel> getList() throws Exception {
		// TODO Auto-generated method stub	
		return DaoFactory.createUserDao().getList();
		
	}


	

}
