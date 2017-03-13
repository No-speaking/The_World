package com.oracle.erp.stock.dao;

import java.util.List;

import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.model.UserModel;


public interface IOrdersDao {
	 public void create(OrdersModel om) throws Exception;
	 public void update(OrdersModel om) throws Exception;
	 public void delete(OrdersModel om) throws Exception;
	 public OrdersModel getOrders(int id) throws Exception;
	 public List<OrdersModel> getList() throws Exception;	
}
