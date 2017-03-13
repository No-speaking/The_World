package com.oracle.erp.stock.factory;

import com.oracle.erp.stock.service.IContactService;
import com.oracle.erp.stock.service.IDreamService;
import com.oracle.erp.stock.service.IOrdersService;
import com.oracle.erp.stock.service.ISubsService;
import com.oracle.erp.stock.service.IUserService;
import com.oracle.erp.stock.service.impl.ContactServiceImpl;
import com.oracle.erp.stock.service.impl.DreamServiceImpl;
import com.oracle.erp.stock.service.impl.OrdersServiceImpl;
import com.oracle.erp.stock.service.impl.SubsServiceImpl;
import com.oracle.erp.stock.service.impl.UserServiceImpl;

public class ServiceFactory {
	public static IUserService createUserService(){
		return new UserServiceImpl();

	}
	public static IOrdersService createOrdersService(){
		return new OrdersServiceImpl();

	}
	public static IDreamService createDreamService(){
		return new DreamServiceImpl();

	}
	public static ISubsService createSubsService(){
		return new SubsServiceImpl();

	}
	public static IContactService createContactService(){
		return new ContactServiceImpl();

	}
}
