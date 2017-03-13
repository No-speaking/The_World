package com.oracle.erp.stock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oracle.erp.stock.dao.IDreamDao;
import com.oracle.erp.stock.factory.ConnectionFactory;
import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.model.UserModel;

public class DreamDaoImpl implements IDreamDao {

	@Override
	public void create(DreamModel dm) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into dream (dname,wantto,price,num) values (?,?,?,?)";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, dm.getDname());
		ps.setString(2,dm.getWantto());
		ps.setDouble(3, dm.getPrice());
		ps.setInt(4, dm.getNum());	
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void update(DreamModel dm) throws Exception {
		// TODO Auto-generated method stub
		String sql="update dream set wantto=?,price=?,num=? where did=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		System.out.println("G:"+dm.getDid());
		ps.setString(1, dm.getWantto());
		ps.setDouble(2, dm.getPrice());
		ps.setInt(3, dm.getNum());
		ps.setInt(4, dm.getDid());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void delete(DreamModel dm) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from dream where did=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, dm.getDid());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public DreamModel getDream(int did) throws Exception {
		// TODO Auto-generated method stub
		DreamModel um=null;
		String sql="select did,wantto,price,num from dream where did=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setInt(1, did);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			um=new DreamModel();
			um.setDid(rs.getInt("did"));
			um.setWantto(rs.getString("wantto"));
			um.setPrice(rs.getDouble("price"));
			um.setNum(rs.getInt("num"));
		}
		rs.close();
		ps.close();
		cn.close();
		
		return um;
	
	}

	@Override
	public List<DreamModel> getList() throws Exception {
		// TODO Auto-generated method stub
		List<DreamModel> list=new ArrayList<DreamModel>();
		String sql="select * from dream";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			DreamModel dm=new DreamModel();
			dm.setDid(rs.getInt("did"));
			dm.setDname(rs.getString("dname"));
			dm.setWantto(rs.getString("wantto"));
			dm.setPrice(rs.getDouble("price"));
			dm.setNum(rs.getInt("num"));
			list.add(dm);
		}
		rs.close();
		ps.close();
		cn.close();
		return list;
	}

}
