package com.oracle.erp.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.service.IOrdersService;

/**
 * Servlet implementation class OrdersDeleteController
 */
@WebServlet("/user/ordersdelete.do")
public class OrdersDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("id");
		System.out.println("E:"+eid);
		try{
			int id=Integer.parseInt(eid);
			IOrdersService es=ServiceFactory.createOrdersService();
			OrdersModel em=new OrdersModel();
			
			em.setId(id);
			es.delete(em);
			response.sendRedirect("usertoview.do");
			
		}
		catch(Exception e){
			e.printStackTrace();
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
