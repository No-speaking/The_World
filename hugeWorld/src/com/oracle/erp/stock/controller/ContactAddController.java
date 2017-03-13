package com.oracle.erp.stock.controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.ContactModel;
import com.oracle.erp.stock.service.IContactService;

/**
 * Servlet implementation class ContactAddController
 */
@WebServlet("/user/contactadd.do")
public class ContactAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String cname=(String) session.getAttribute("name");
		String email=request.getParameter("email");
		String subject=request.getParameter("subject");
		String context=request.getParameter("context");
		ContactModel cm=new ContactModel();
		cm.setCname(cname);
		cm.setEmail(email);
		cm.setSubject(subject);
		IContactService cs=ServiceFactory.createContactService();
		try {
			cs.add(cm);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Properties p=new Properties();
		p.put("mail.smtp.host", "127.0.0.1");
		p.put("mail.transport.protocol", "smtp");
		p.put("mail.smtp.port", "25");
		try {
		Session session1=Session.getInstance(p);
		
		Message mail=new MimeMessage(session1);
		//
		Address frombox=new InternetAddress(email);
		
		Address tobox=new InternetAddress("zmm@city.com");
		//
		mail.setFrom(frombox);
		mail.setSubject(subject);
		mail.setRecipient(RecipientType.TO, tobox);
		mail.setText(context);
		Transport.send(mail);
		} catch (MessagingException e) {
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
