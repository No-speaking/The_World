package com.oracle.erp.stock.service.impl;

import java.util.List;

import com.oracle.erp.stock.dao.IDreamDao;
import com.oracle.erp.stock.dao.IUserDao;
import com.oracle.erp.stock.factory.DaoFactory;
import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.service.IDreamService;

public class DreamServiceImpl implements IDreamService {

	@Override
	public void add(DreamModel dm) throws Exception {
		// TODO Auto-generated method stub
		IDreamDao dd=DaoFactory.createDreamDao();
		dd.create(dm);
	}

	@Override
	public void modify(DreamModel dm) throws Exception {
		// TODO Auto-generated method stub
		IDreamDao dd=DaoFactory.createDreamDao();
		dd.update(dm);
	}

	@Override
	public void delete(DreamModel dm) throws Exception {
		// TODO Auto-generated method stub
		IDreamDao dd=DaoFactory.createDreamDao();
		dd.delete(dm);
	}

	@Override
	public DreamModel getDream(int did) throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createDreamDao().getDream(did);
	}

	@Override
	public List<DreamModel> getList() throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createDreamDao().getList();
	}

}
