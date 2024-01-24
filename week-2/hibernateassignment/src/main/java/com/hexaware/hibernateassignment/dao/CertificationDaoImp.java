package com.hexaware.hibernateassignment.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.hibernateassignment.HibernateUtil;
import com.hexaware.hibernateassignment.bean.Certification;

@Repository
public class CertificationDaoImp implements ICertificationDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@Override
	public boolean insertCertification(Certification c) {
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction txn = session.beginTransaction();
    	
    	Serializable s = session.save(c);
    	
    	txn.commit();
    	
    	return s != null;
    	
    	
	}

	@Override
	public boolean updateCertification(Certification c) {

		Session session = sessionFactory.openSession();
    	
    	Transaction txn = session.beginTransaction();
		
    	Certification ct = session.get(Certification.class, c.getTitle());
    	
    	ct.setDescription(c.getDescription());
    	ct.setStartDate(c.getStartDate());
    	ct.setEndDate(c.getEndDate());
    	
    	Serializable s = session.save(ct);
    	
    	txn.commit();
    	
    	return s!=null;
	}

	@Override
	public Certification selectOne(String title) {
		
		Session session = sessionFactory.openSession();
		
		Query<Certification> query = session.createQuery("from Certification c where c.title = :title"); //query with positional parameter
    	
		query.setParameter("title", title);
    	
		Certification result = query.getSingleResult();
				
    	return result;
	}

	@Override
	public List<Certification> selectAll() {
		
		Session session = sessionFactory.openSession();
		
		Query<Certification> query = session.createQuery("select c from Certification c");
		
		return query.getResultList();
	}

	

}
