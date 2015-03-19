package com.cricpoker.data.access;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cricpoker.util.HibernateUtil;

public class CommonDao<T> {
	
	private Class<T> clazz;
	
	@SuppressWarnings("hiding")
	public <T> CommonDao() {
		
		Type genericSuperclass = this.getClass().getGenericSuperclass();
		
		System.out.println(genericSuperclass);
		if (genericSuperclass instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) genericSuperclass;
			Type type = pt.getActualTypeArguments()[0];
			System.out.println(type);
			//clazz = (Class<T>) type;
		}
	}

	@SuppressWarnings("hiding")
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
