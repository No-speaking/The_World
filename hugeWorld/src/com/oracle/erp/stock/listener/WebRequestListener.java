package com.oracle.erp.stock.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class WebRequestListener
 *
 */
@WebListener
public class WebRequestListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public WebRequestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent event)  { 
         // TODO Auto-generated method stub
    	ServletContext application=event.getServletContext();
    	Integer userAccessNum=(Integer)application.getAttribute("userAccessNum");
    	
    	if(userAccessNum!=null){
    		userAccessNum++;
    		application.setAttribute("userAccessNum", userAccessNum);
    	}
    }
	
}
