package com.oracle.erp.stock.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.service.IDreamService;
import com.oracle.erp.stock.service.IOrdersService;

/**
 * Servlet implementation class DreamToDeleteController
 */
@WebServlet("/user/dreamtodelete.do")
public class DreamToDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DreamToDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			String id=request.getParameter("id");
			int id1=Integer.parseInt(id);
			IDreamService ds=ServiceFactory.createDreamService();
			DreamModel dm=ds.getDream(id1);
			request.setAttribute("dm",dm);
			RequestDispatcher rd=request.getRequestDispatcher("dreamdelete.jsp");
			rd.forward(request, response);
			
			
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
