package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public logoutServlet() 
    {
        super();
    }
	
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpSession session = request.getSession();
		session.invalidate();
	}

}
