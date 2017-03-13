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
 * Servlet implementation class PhotoShowController
 */
@WebServlet("/user/photoshow.do")
public class PhotoShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoShowController() {
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
			UserModel um=ServiceFactory.createUserService().getUser(name);
			if(um!=null){
				response.setContentType(um.getPhototype());
				OutputStream out=response.getOutputStream();
				InputStream in=um.getPhoto().getBinaryStream();
				int data=0;
				while((data=in.read())!=-1){
					out.write(data);
				}
				out.flush();
				out.close();
				in.close();
				System.out.println("OK1111");
				
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
