package com.oracle.erp.stock.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.service.IOrdersService;

/**
 * Servlet implementation class OrdersToModifyController
 */
@WebServlet("/user/orderstomodify.do")
public class OrdersToModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersToModifyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			String id1=request.getParameter("id");
			int id=Integer.parseInt(id1);
			IOrdersService os=ServiceFactory.createOrdersService();
			OrdersModel om=os.getOrders(id);
			request.setAttribute("om",om);
			RequestDispatcher rd=request.getRequestDispatcher("ordermodify.jsp");
			rd.forward(request, response);
			System.out.println("1");
			
			
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
