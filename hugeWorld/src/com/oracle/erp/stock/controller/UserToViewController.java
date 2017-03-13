package com.oracle.erp.stock.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.ContactModel;
import com.oracle.erp.stock.model.DreamModel;
import com.oracle.erp.stock.model.OrdersModel;
import com.oracle.erp.stock.model.SubsModel;
import com.oracle.erp.stock.model.UserModel;
import com.oracle.erp.stock.service.IContactService;
import com.oracle.erp.stock.service.IDreamService;
import com.oracle.erp.stock.service.IOrdersService;
import com.oracle.erp.stock.service.ISubsService;
import com.oracle.erp.stock.service.IUserService;

/**
 * Servlet implementation class UserToViewController
 */
@WebServlet("/user/usertoview.do")
public class UserToViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserToViewController() {
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
			if(name!=null){
			
			IUserService us=ServiceFactory.createUserService();
			UserModel um=us.getUser(name);
			request.setAttribute("um",um);
			
			
			ISubsService ss=ServiceFactory.createSubsService();
			SubsModel sm=ss.getSubs(name);
			request.setAttribute("sm",sm);
			
			IContactService cs=ServiceFactory.createContactService();
			List<ContactModel> cmlist=cs.getList();
			System.out.println("3");
			request.setAttribute("cmlist",cmlist );
			
			IOrdersService os=ServiceFactory.createOrdersService();
			List<OrdersModel> omlist=os.getList();
			System.out.println("3");
			request.setAttribute("omlist",omlist );
			
			IDreamService ds=ServiceFactory.createDreamService();
			List<DreamModel> dmlist=ds.getList();
			System.out.println("3");
			request.setAttribute("dmlist",dmlist );
			
			RequestDispatcher rd=request.getRequestDispatcher("my.jsp");
			rd.forward(request, response);
			}
			else{
				RequestDispatcher rd=request.getRequestDispatcher("my.jsp");
				rd.forward(request, response);
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
