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
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialBlob;

import com.jspsmart.upload.SmartUpload;

import com.oracle.erp.stock.factory.ServiceFactory;
import com.oracle.erp.stock.model.UserModel;
import com.oracle.erp.stock.service.IUserService;

/**
 * Servlet implementation class UserModifyController
 */
@WebServlet("/user/usertomodify.do")
public class UserModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserModifyController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		try{
			String name=(String) session.getAttribute("name");
			SmartUpload upload=new SmartUpload();
			upload.initialize(config, request, response);
			upload.upload();
			
			String password=upload.getRequest().getParameter("xpassword");
			IUserService us=ServiceFactory.createUserService();
			UserModel um=new UserModel();
			
			String phototype=null;
			String fileName=null;
			Blob photo=null;
			System.out.println("cuowuqq");
			if(upload.getFiles().getSize()>0){
				fileName=upload.getFiles().getFile(0).getFileName();
				System.out.println(fileName+"aaaa");
				phototype=upload.getFiles().getFile(0).getContentType();
				 System.out.println(phototype+"bbb");
				upload.getFiles().getFile(0).saveAs("/upload/"+fileName);
				String realpath=request.getServletContext().getRealPath("/upload");
				InputStream in=new FileInputStream(realpath+"/"+fileName);
				
				int size=upload.getFiles().getFile(0).getSize();
				byte[] contents=new byte[size];
				int data=0;
				int i=0;
				while((data=in.read())!=-1){
					contents[i]=(byte)data;
					i++;				
				}
				photo=new SerialBlob(contents);
				um.setPhoto(photo);
			}
			else{
				um.setPhoto(us.getUser(name).getPhoto());
				System.out.println("cuowu");
			}
			
			
			
			
			um.setName(name);
			um.setPassword(password);
			
			um.setPhototype(phototype);
			us.modify(um);
			//es.add(name, email, age,contact,address,gender, job,photo,fileName,contentType);
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
