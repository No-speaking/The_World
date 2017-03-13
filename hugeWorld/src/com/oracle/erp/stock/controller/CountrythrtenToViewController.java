package com.oracle.erp.stock.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.UserModel;
import com.oracle.erp.stock.service.IUserService;

/**
 * Servlet implementation class CountrythrtenToViewController
 */
@WebServlet("/user/countrythrtentoview.do")
public class CountrythrtenToViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountrythrtenToViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		try{
			String name=(String) session.getAttribute("name");
			IUserService us=ServiceFactory.createUserService();
			UserModel um=us.getUser(name);
			request.setAttribute("um",um);
			RequestDispatcher rd=request.getRequestDispatcher("country13.jsp");
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
