package com.oracle.erp.stock.controller;

import java.io.IOException;
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
 * Servlet implementation class DreamDeleteController
 */
@WebServlet("/user/dreamdelete.do")
public class DreamDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DreamDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String did=request.getParameter("did");
		System.out.println("E:"+did);
		try{
			int id=Integer.parseInt(did);
			IDreamService ds=ServiceFactory.createDreamService();
			DreamModel dm=new DreamModel();
			
			dm.setDid(id);
			ds.delete(dm);
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
