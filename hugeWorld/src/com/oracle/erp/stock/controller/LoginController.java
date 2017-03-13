package com.oracle.erp.stock.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.UserModel;

/**
 * Servlet implementation class PhotoPhotoShowController
 */
@WebServlet("/user/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
			String name=request.getParameter("name");
			String password=request.getParameter("password");
		System.out.println(name+"aaaaaaaa");
		if(name!=null&&name.trim().length()!=0&&password!=null&&password.trim().length()!=0){
				UserModel um=ServiceFactory.createUserService().getUser(name);
				String password1=um.getPassword();
				if(password.equals(password1)&&name.equals(um.getName())){
					session.setAttribute("name",name);
					response.sendRedirect("usertoview.do");
				}
				else{
					response.sendRedirect("my.jsp");
				}
			
			}
			else{
				response.sendRedirect("my.jsp");
			}
			
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
