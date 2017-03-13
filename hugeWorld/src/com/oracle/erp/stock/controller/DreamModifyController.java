package com.oracle.erp.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.service.IDreamService;

/**
 * Servlet implementation class DreamModifyController
 */
@WebServlet("/user/dreammodify.do")
public class DreamModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DreamModifyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String did=request.getParameter("did");
		String wantto=request.getParameter("wantto");
		String price=request.getParameter("price");
		String num=request.getParameter("num");
		Double price1=Double.parseDouble(price);
		int num1=Integer.parseInt(num);
		int did1=Integer.parseInt(did);
		DreamModel dm=new DreamModel();
		dm.setWantto(wantto);
		dm.setPrice(price1);
		dm.setNum(num1);
		dm.setDid(did1);
		IDreamService ds=ServiceFactory.createDreamService();
		try {
			ds.modify(dm);
			response.sendRedirect("usertoview.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
