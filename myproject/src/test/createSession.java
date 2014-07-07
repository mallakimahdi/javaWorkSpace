package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

/**
 * Servlet implementation class createSession
 */
public class createSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)throws ServletException, IOException 
	{
		//super.service(arg0, arg1);
		
		HttpSession session = arg0.getSession();
		String username = arg0.getParameter("username");
		if(username != null)
			session.setAttribute("username", "mahdi");
		else
			arg1.getWriter().print("you have not access");
	}
}
