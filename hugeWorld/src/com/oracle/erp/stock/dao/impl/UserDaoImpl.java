package com.oracle.erp.stock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oracle.erp.stock.dao.IUserDao;
import com.oracle.erp.stock.factory.ConnectionFactory;
import com.oracle.erp.stock.model.UserModel;

public class UserDaoImpl implements IUserDao {

	@Override
	public void create(UserModel um) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into user (name,password,photo,phototype) values(?,?,?,?)";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, um.getName());
		ps.setString(2, um.getPassword());
		ps.setBlob(3,um.getPhoto());
		ps.setString(4,um.getPhototype());
		ps.executeUpdate();
		ps.close();
		cn.close();

	}

	@Override
	public void update(UserModel um) throws Exception {
		// TODO Auto-generated method stub
		String sql="update user set password=?,photo=? where name=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, um.getPassword());
		ps.setBlob(2, um.getPhoto());
		ps.setString(3, um.getName());
		ps.executeUpdate();
		ps.close();
		cn.close();
		
	}

	@Override
	public void delete(UserModel um) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from user where name=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, um.getName());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	
	public UserModel getUser(String name) throws Exception {
		// TODO Auto-generated method stub
		    UserModel um=null;
			String sql="select name,password,photo from user where name=?";
			Connection cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				um=new UserModel();
				um.setName(rs.getString("name"));
				um.setPassword(rs.getString("password"));
				um.setPhoto(rs.getBlob("photo"));
			}
			rs.close();
			ps.close();
			cn.close();
			
			return um;
		
	}

	@Override
	public List<UserModel> getList() throws Exception {
		// TODO Auto-generated method stub
		List<UserModel> list=new ArrayList<UserModel>();
		String sql="select *from dream d join user u on d.dname=u.name";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			UserModel um=new UserModel();
			um.setName(rs.getString("name"));
			um.setPassword(rs.getString("password"));
			um.setPhoto(rs.getBlob("photo"));
			list.add(um);
		}
		rs.close();
		ps.close();
		cn.close();
		return list;
	}




}
