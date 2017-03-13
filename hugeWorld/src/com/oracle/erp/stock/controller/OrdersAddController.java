package com.oracle.erp.stock.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialBlob;

import org.apache.commons.io.IOUtils;

import com.jspsmart.upload.SmartUpload;
import com.oracle.erp.stock.dao.impl.OrdersDaoImpl;
import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.model.UserModel;

/**
 * Servlet implementation class NewsAddController
 */
@WebServlet("/user/addorders.do")
public class OrdersAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config=null;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session=request.getSession();
		 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");  
		 try {  
			String pname=(String) session.getAttribute("name");
			String strdate=request.getParameter("strdate");
			System.out.println(strdate+"hdjfhskdhfkhsedkf");
			String enddate=request.getParameter("enddate");
			String place=request.getParameter("place");
			String count1=request.getParameter("count");
			int count=Integer.parseInt(count1);
			Date strdate1 = sdf.parse(strdate);
			System.out.println(strdate+"111111111111111111111");
			Date enddate1 = sdf.parse(enddate);
			
			OrdersModel om=new OrdersModel();
			om.setPname(pname);
			om.setStrdate(strdate1);
			om.setEnddate(enddate1);
			om.setCount(count);
			om.setPlace(place);

				
					ServiceFactory.createOrdersService().add(om);
			
			
			
			System.out.println("OK222");
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
		doGet(request,response);
	}

}
