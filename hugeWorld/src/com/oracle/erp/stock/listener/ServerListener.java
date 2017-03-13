package com.oracle.erp.stock.listener;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServerListener
 *
 */
@WebListener
public class ServerListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServerListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	try {
    		ServletContext application=event.getServletContext();
    		application.setAttribute("usernum", 0);
    		String realPath=application.getRealPath("/WEB-INF/info.txt");
			FileReader in=new FileReader(realPath);
			BufferedReader br = new BufferedReader(in);
			String s=br.readLine();
			System.out.println(s);
			if(s!=null){
				int userAccessNum=Integer.valueOf(s);
				System.out.println(userAccessNum);
				application.setAttribute("userAccessNum", userAccessNum);
			}	
			
			br.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	ServletContext application=event.getServletContext();
    	Integer userAccessNum=(Integer) application.getAttribute("userAccessNum");
    	try {
    		String realPath=application.getRealPath("/WEB-INF/info.txt");
			FileWriter out=new FileWriter(realPath);
			BufferedWriter writer=new BufferedWriter(out);
			if(userAccessNum!=null){
				writer.write(String.valueOf(userAccessNum));
				writer.newLine();
			}
			out.flush();
			writer.flush();
			writer.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
