package com.oracle.erp.stock.service;

import java.util.List;

import com.oracle.erp.stock.model.UserModel;

public interface IUserService {
	public void add(UserModel um) throws Exception;
	public void modify(UserModel um) throws Exception;
	public void delete(UserModel um) throws Exception;
	public UserModel getUser(String name) throws Exception;
	public List<UserModel> getList() throws Exception;
}
