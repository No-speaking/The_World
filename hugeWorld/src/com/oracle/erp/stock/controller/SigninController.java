package com.oracle.erp.stock.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialBlob;

import com.jspsmart.upload.SmartUpload;
import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.UserModel;
import com.oracle.erp.stock.service.IUserService;

/**
 * Servlet implementation class SigninController
 */
@WebServlet("/user/signin.do")
public class SigninController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
			this.config=config;
		}
    public SigninController() {
        super();
        // TODO Auto-generated constructor stub
    }
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			
			SmartUpload upload=new SmartUpload();
			upload.initialize(config, request, response);
			upload.upload();
			String tname=upload.getRequest().getParameter("tname");
			System.out.println("name"+tname);
			String tpassword=upload.getRequest().getParameter("tpassword");
			UserModel um=new UserModel();
			um.setName(tname);
			um.setPassword(tpassword);
			
			
			
				String fileName=upload.getFiles().getFile(0).getFileName();
				System.out.println(fileName);
				String photoType=upload.getFiles().getFile(0).getContentType();
				upload.getFiles().getFile(0).saveAs("/upload/"+fileName);
				String realpath=request.getServletContext().getRealPath("/upload");
				InputStream in=new FileInputStream(realpath+"/"+fileName);
				
				int size=upload.getFiles().getFile(0).getSize();
				System.out.println("OK01");
				byte[] contents=new byte[size];
				int data=0;
				int i=0;
				while((data=in.read())!=-1){
					contents[i]=(byte)data;
					i++;				
				}
				System.out.println("OK02");
				Blob photo=new SerialBlob(contents);
				System.out.println("OK03");
				um.setPhoto(photo);
				um.setPhototype(photoType);
				
				
				
				
			
			IUserService es=ServiceFactory.createUserService();
			System.out.println("OK04");
			es.add(um);
			System.out.println("OK05");
			response.sendRedirect("index.jsp");	
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
