package com.oracle.erp.stock.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.oracle.erp.stock.dao.IContactDao;
import com.oracle.erp.stock.factory.ConnectionFactory;
import com.oracle.erp.stock.model.ContactModel;
import com.oracle.erp.stock.model.SubsModel;

public class ContactDaoImpl implements IContactDao {

	@Override
	public void create(ContactModel cm) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into contact (cname,subject,cid,email) values(?,?,?,?)";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, cm.getCname());
		ps.setString(2, cm.getSubject());
		ps.setInt(3, cm.getCid());
		ps.setString(4, cm.getEmail());
		ps.executeUpdate();
		ps.close();
		cn.close();
	}

	@Override
	public void update(ContactModel cm) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ContactModel cm) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public ContactModel getContact(int cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactModel> getList() throws Exception {
		// TODO Auto-generated method stub
		List<ContactModel> list=new ArrayList<ContactModel>();
		String sql="select *from contact c join user u on c.cname=u.name";
		Connection cn=ConnectionFactory.getConnection();
		PreparedStatement ps=cn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			ContactModel cm=new ContactModel();
			cm.setCname(rs.getString("cname"));
			cm.setSubject(rs.getString("subject"));
			cm.setCid(rs.getInt("cid"));
			cm.setEmail(rs.getString("email"));
			list.add(cm);
		}
		rs.close();
		ps.close();
		cn.close();
		return list;
	}

}
