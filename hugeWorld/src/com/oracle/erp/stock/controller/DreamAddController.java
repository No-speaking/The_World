package com.oracle.erp.stock.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.model.OrdersModel;

/**
 * Servlet implementation class DreamAddController
 */
@WebServlet("/user/adddream.do")
public class DreamAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DreamAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		 
			String dname=(String) session.getAttribute("name");
			String wantto=request.getParameter("wantto");
			String price=request.getParameter("price");
			String num1=request.getParameter("num");
			int num=Integer.parseInt(num1);
			double price1=Double.parseDouble(price);
			DreamModel om=new DreamModel();
			om.setWantto(wantto);
			om.setPrice(price1);
			om.setNum(num);
			om.setDname(dname);
			

				
					try {
						ServiceFactory.createDreamService().add(om);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
			
					RequestDispatcher rd=request.getRequestDispatcher("usertoview.do");
					rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
