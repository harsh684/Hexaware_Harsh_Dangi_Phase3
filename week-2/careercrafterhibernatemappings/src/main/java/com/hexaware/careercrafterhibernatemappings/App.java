package com.hexaware.careercrafterhibernatemappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
    	Session session = sessionFactory.openSession();
    	
    	System.out.println(session);
    }
}
