package com.oracle.erp.stock.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.service.IOrdersService;

/**
 * Servlet implementation class OrdersModifyController
 */
@WebServlet("/user/ordersmodify.do")
public class OrdersModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersModifyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		String eid=request.getParameter("id");
		System.out.println("G:"+eid);
		int id=Integer.parseInt(eid);
		String strdate=request.getParameter("strdate");
		String enddate=request.getParameter("enddate");
		String place=request.getParameter("place");
		String count=request.getParameter("count");
		int count1=Integer.parseInt(count);
		Date enddate1 = sdf.parse(enddate);
		Date strdate1 = sdf.parse(strdate);
		
		
		OrdersModel om=new OrdersModel();
		System.out.println("3");
		IOrdersService os=ServiceFactory.createOrdersService();
		System.out.println("4");
		om.setId(id);
		om.setStrdate(strdate1);
		om.setEnddate(enddate1);
		om.setPlace(place);
		om.setCount(count1);
		try {
			os.modify(om);
			System.out.println("修");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("修改");
		response.sendRedirect("usertoview.do");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
