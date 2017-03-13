package com.oracle.erp.stock.service;

import java.util.List;

import com.oracle.erp.stock.model.OrdersModel;

public interface IOrdersService {
	public void add(OrdersModel dm) throws Exception;
	public void modify(OrdersModel dm) throws Exception;
	public void delete(OrdersModel dm) throws Exception;
	public OrdersModel getOrders(int id) throws Exception;
	public List<OrdersModel> getList() throws Exception;
}
