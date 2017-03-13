package com.oracle.erp.stock.dao;

import java.util.List;

import com.oracle.erp.stock.model.UserModel;


public interface IUserDao {
	 public void create(UserModel um) throws Exception;
	 public void update(UserModel um) throws Exception;
	 public void delete(UserModel um) throws Exception;
	 public UserModel getUser(String name) throws Exception;
	 public List<UserModel> getList() throws Exception;
}
