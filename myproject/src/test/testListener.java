package test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class testListener implements HttpSessionListener
{

	public void sessionCreated(HttpSessionEvent arg0) 
	{
		System.out.println("a session created");
		Object count = arg0.getSession().getServletContext().getAttribute("NUM");
		
	}

	public void sessionDestroyed(HttpSessionEvent arg0) 
	{
		
	}

}
