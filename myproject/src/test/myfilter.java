package test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class myfilter implements Filter 
{
    public myfilter() 
    {
    }
    
    public void init(FilterConfig fConfig) throws ServletException 
	{
    	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		System.out.println("in filter");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String username = (String) httpRequest.getSession().getAttribute("user");
		/*
		if(username == null)
			request.getRequestDispatcher("access.jsp").forward(request, response);
		else
			
			*/
		chain.doFilter(request, response);
	}

	public void destroy() 
	{
		
	}	
}
