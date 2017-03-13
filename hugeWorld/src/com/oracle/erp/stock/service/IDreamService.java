package com.oracle.erp.stock.service;

import java.util.List;

import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.model.UserModel;

public interface IDreamService {
	public void add(DreamModel dm) throws Exception;
	public void modify(DreamModel dm) throws Exception;
	public void delete(DreamModel dm) throws Exception;
	public DreamModel getDream(int did) throws Exception;
	public List<DreamModel> getList() throws Exception;
}
