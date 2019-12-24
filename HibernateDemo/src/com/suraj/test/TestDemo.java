package com.suraj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suraj.bean.Person;

public class TestDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Person person = new Person(5, "Su", "Bho", "Satara");
		
//		Person person = session.get(Person.class, 5);

//		session.delete(person);

		session.save(person);

		session.getTransaction().commit();

		session.close();
	}

}
