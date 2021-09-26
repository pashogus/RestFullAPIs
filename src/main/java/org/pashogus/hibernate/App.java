package org.pashogus.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(TempContents.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		System.out.println(session);
		session.close();
		factory.close();
		

	}

}
