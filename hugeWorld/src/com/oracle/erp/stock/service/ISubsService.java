package com.oracle.erp.stock.service;

import java.util.List;

import com.oracle.erp.stock.model.SubsModel;

public interface ISubsService {
	public void add(SubsModel sm) throws Exception;
	public void modify(SubsModel sm) throws Exception;
	public void delete(SubsModel sm) throws Exception;
	public SubsModel getSubs(String sname) throws Exception;
	public List<SubsModel> getList() throws Exception;
}
