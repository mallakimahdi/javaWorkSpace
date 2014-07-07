package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class DAO 
{
	public DAO() 
	{
		
	}
	
	public void save(structEntity struct)
	{
		getSession().save(struct);
	}
	
	private Session getSession()
	{
		Configuration conf = new Configuration();
		conf.configure("hibernate_conf.xml");
		SessionFactory sessionFactory = conf.buildSessionFactory();
		return sessionFactory.getCurrentSession();
	}
}
