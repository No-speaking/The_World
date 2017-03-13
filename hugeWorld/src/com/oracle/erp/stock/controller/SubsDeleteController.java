package com.oracle.erp.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.model.SubsModel;
import com.oracle.erp.stock.service.IOrdersService;
import com.oracle.erp.stock.service.ISubsService;

/**
 * Servlet implementation class SubsDeleteController
 */
@WebServlet("/user/subsdelete.do")
public class SubsDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubsDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mail=request.getParameter("mail");
		try{
			ISubsService ss=ServiceFactory.createSubsService();
			SubsModel sm=new SubsModel();
			
			sm.setMail(mail);
			ss.delete(sm);
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
