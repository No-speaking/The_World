package com.oracle.erp.stock.service.impl;

import java.util.List;

import com.oracle.erp.stock.dao.IOrdersDao;
import com.oracle.erp.stock.factory.DaoFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.service.IOrdersService;

public class OrdersServiceImpl implements IOrdersService {

	@Override
	public void add(OrdersModel dm) throws Exception {
		// TODO Auto-generated method stub
		IOrdersDao dd=DaoFactory.createOrdersDao();
		dd.create(dm);
	}

	@Override
	public void modify(OrdersModel dm) throws Exception {
		// TODO Auto-generated method stub
		IOrdersDao dd=DaoFactory.createOrdersDao();
		dd.update(dm);
	}

	@Override
	public void delete(OrdersModel dm) throws Exception {
		// TODO Auto-generated method stub
		IOrdersDao dd=DaoFactory.createOrdersDao();
		dd.delete(dm);
	}

	@Override
	public OrdersModel getOrders(int id) throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createOrdersDao().getOrders(id);
	}

	@Override
	public List<OrdersModel> getList() throws Exception {
		// TODO Auto-generated method stub
		return DaoFactory.createOrdersDao().getList();
	}

}
