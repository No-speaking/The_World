package com.oracle.erp.stock.dao;

import java.util.List;

import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.model.UserModel;

public interface IDreamDao {
	 public void create(DreamModel dm) throws Exception;
	 public void update(DreamModel dm) throws Exception;
	 public void delete(DreamModel dm) throws Exception;
	 public DreamModel getDream(int did) throws Exception;
	 public List<DreamModel> getList() throws Exception;
}
