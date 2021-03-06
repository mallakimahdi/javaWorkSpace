package hibernate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class mainServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public mainServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Session session = hibernateHandler.getSession();
		
		Transaction tx = session.beginTransaction();
		
		studentDAO student = new studentDAO();
		student.setId(1);
		student.setName("ali");
		student.setFamily("mallaki");
		try
		{
			session.delete(student);
		}
		catch(HibernateException e)
		{
			response.getWriter().write("cannot delete object "+student.getId());
		}
		
		tx.commit();
	}
}
