package com.oracle.erp.stock.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class SessionProprtyChangeListener
 *
 */
@WebListener
public class SessionProprtyChangeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionProprtyChangeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name1=event.getName();
    	String name=(String) event.getValue();
    	HttpSession session=event.getSession();
    	ServletContext application=session.getServletContext();
    	if(name1!=null&&name1.equals("name")&&name!=null){
    		int usernum=(Integer)application.getAttribute("usernum")-1;
    		application.setAttribute("usernum", usernum);
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name1=event.getName();
    	System.out.println(name1);
    	String name=(String) event.getValue();
    	HttpSession session=event.getSession();
    	ServletContext application=session.getServletContext();
    	if(name1!=null&&name1.equals("name")&&name!=null){
    		int usernum=(Integer)application.getAttribute("usernum")+1;
    		System.out.println(usernum);
    		application.setAttribute("usernum", usernum);
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
