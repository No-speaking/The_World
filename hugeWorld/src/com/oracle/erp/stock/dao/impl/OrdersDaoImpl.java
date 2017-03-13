package com.oracle.erp.stock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.erp.stock.dao.IOrdersDao;
import com.oracle.erp.stock.factory.ConnectionFactory;
import com.oracle.erp.stock.factory.DaoFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.model.UserModel;

public class OrdersDaoImpl implements IOrdersDao {

	@Override
	public void create(OrdersModel om) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into orders (pname,strdate,enddate,place,count) values (?,?,?,?,?)";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		System.out.println("G啊啊啊啊啊:"+om.getStrdate());
		ps.setString(1, om.getPname());
		ps.setDate(2, new java.sql.Date(om.getStrdate().getTime()));
		ps.setDate(3, new java.sql.Date(om.getEnddate().getTime()));
		ps.setString(4, om.getPlace());
		ps.setInt(5, om.getCount());	
		ps.executeUpdate();
		ps.close();
		cn.close();
		
	}


	
	public void update(OrdersModel om) throws Exception {
		// TODO Auto-generated method stub
		String sql="update orders set strdate=?,enddate=?,place=?,count=? where id=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		
		ps.setDate(1, new java.sql.Date(om.getStrdate().getDate()));
		ps.setDate(2, new java.sql.Date(om.getEnddate().getDate()));
		ps.setString(3, om.getPlace());
		ps.setInt(4, om.getCount());
		ps.setInt(5, om.getId());
		ps.executeUpdate();
		ps.close();
		cn.close();
		
	}

	@Override
	public void delete(OrdersModel om) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from orders where id=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, om.getId());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}


	@Override
	public OrdersModel getOrders(int id) throws Exception {
		// TODO Auto-generated method stub
		    OrdersModel om=null;
			String sql="select id,strdate,enddate,place,count from orders where id=?";
			Connection cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				om=new OrdersModel();
				om.setId(rs.getInt("id"));
				om.setStrdate(rs.getDate("strdate"));
				om.setEnddate(rs.getDate("enddate"));
				om.setPlace(rs.getString("place"));
				om.setCount(rs.getInt("count"));
			}
			rs.close();
			ps.close();
			cn.close();
			
			return om;
	}



	@Override
	public List<OrdersModel> getList() throws Exception {
		// TODO Auto-generated method stub
		List<OrdersModel> list=new ArrayList<OrdersModel>();
		String sql="select *from orders o join user u on o.pname=u.name";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			OrdersModel um=new OrdersModel();
			um.setId(rs.getInt("id"));
			um.setPname(rs.getString("pname"));
			um.setStrdate(rs.getDate("strdate"));
			um.setEnddate(rs.getDate("enddate"));
			um.setPlace(rs.getString("place"));
			um.setCount(rs.getInt("count"));
			list.add(um);
		}
		rs.close();
		ps.close();
		cn.close();
		return list;
	}

}
