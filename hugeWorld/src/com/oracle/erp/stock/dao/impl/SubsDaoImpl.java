package com.oracle.erp.stock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oracle.erp.stock.dao.ISubsDao;
import com.oracle.erp.stock.factory.ConnectionFactory;
import com.oracle.erp.stock.model.SubsModel;
import com.oracle.erp.stock.model.UserModel;

public class SubsDaoImpl implements ISubsDao {

	@Override
	public void create(SubsModel sm) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into subs (sname,mail,ding) values(?,?,?)";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, sm.getSname());
		ps.setString(2, sm.getMail());
		ps.setString(3, sm.getDing());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void update(SubsModel sm) throws Exception {
		// TODO Auto-generated method stub
		String sql="update subs set mail=? where sname=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, sm.getMail());
		ps.setString(2, sm.getSname());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void delete(SubsModel sm) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from subs where mail=?";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, sm.getMail());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public SubsModel getSubs(String sname) throws Exception {
		// TODO Auto-generated method stub
		SubsModel sm=null;
			String sql="select mail,ding from subs where sname=?";
			Connection cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, sname);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				sm=new SubsModel();
				sm.setMail(rs.getString("mail"));
				sm.setDing(rs.getString("ding"));
			}
			rs.close();
			ps.close();
			cn.close();
			
			return sm;
	}

	@Override
	public List<SubsModel> getList() throws Exception {
		// TODO Auto-generated method stub
		List<SubsModel> list=new ArrayList<SubsModel>();
		String sql="select *from subs s join user u on s.sname=u.name";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			SubsModel sm=new SubsModel();
			sm.setSname(rs.getString("sname"));
			sm.setMail(rs.getString("mail"));
			list.add(sm);
		}
		rs.close();
		ps.close();
		cn.close();
		return list;
	}

}
