package com.oracle.erp.stock.dao;

import java.util.List;

import com.oracle.erp.stock.model.SubsModel;


public interface ISubsDao {
	public void create(SubsModel sm) throws Exception;
	 public void update(SubsModel sm) throws Exception;
	 public void delete(SubsModel sm) throws Exception;
	 public SubsModel getSubs(String sname) throws Exception;
	 public List<SubsModel> getList() throws Exception;
}
