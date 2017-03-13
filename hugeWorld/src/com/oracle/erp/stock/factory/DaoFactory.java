package com.oracle.erp.stock.factory;

import java.util.List;

import com.oracle.erp.stock.dao.IContactDao;
import com.oracle.erp.stock.dao.IDreamDao;
import com.oracle.erp.stock.dao.IOrdersDao;
import com.oracle.erp.stock.dao.ISubsDao;
import com.oracle.erp.stock.dao.IUserDao;
import com.oracle.erp.stock.dao.impl.ContactDaoImpl;
import com.oracle.erp.stock.dao.impl.DreamDaoImpl;
import com.oracle.erp.stock.dao.impl.OrdersDaoImpl;
import com.oracle.erp.stock.dao.impl.SubsDaoImpl;
import com.oracle.erp.stock.dao.impl.UserDaoImpl;
import com.oracle.erp.stock.model.UserModel;

public class DaoFactory {
	public static IOrdersDao createOrdersDao(){
		
			return new OrdersDaoImpl();
		}

	public static IUserDao createUserDao(){
		return new UserDaoImpl();

	}	
	
	public static IDreamDao createDreamDao(){
		
		return new DreamDaoImpl();
	}
	
    public static ISubsDao createSubsDao(){
		
		return new SubsDaoImpl();
	}
 public static IContactDao createContactDao(){
		
		return new ContactDaoImpl();
	}
}
