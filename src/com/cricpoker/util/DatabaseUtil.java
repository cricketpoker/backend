package com.cricpoker.util;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DatabaseUtil {
	
	public <T> void insert(T object) {
		
		Transaction transaction = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(object);
			session.getTransaction().commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		
	}

}
