package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setsName("Saurabh");
    s1.setRollNo(106);
    s1.setsAge(35);

    Configuration cfg = new Configuration();
    cfg.configure();
    cfg.addAnnotatedClass(com.Hibernate.Student.class);
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();

    Transaction transaction = session.beginTransaction();
    session.save(s1);
    transaction.commit();

    System.out.println(s1);

    }
}