package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        // To store data follow below code
//    Student s1 = new Student();
//    s1.setsName("Chiya");
//    s1.setRollNo(107);
//    s1.setsAge(25);
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.Hibernate.Student.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//    Transaction transaction = session.beginTransaction(); //Transaction is needed when we are providing data to the database, for fetching we don't need it
//    session.persist(s1); // To store the data in database we use persist
//    transaction.commit();
//    session.close();
//    sf.close();


        // To fetch data follow below code

//        Student s2 = null;
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.Hibernate.Student.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//        s2 = session.get(Student.class,102); // get method takes two parameters to fetch the data, first is the type of data and second is the primary key
//        session.close();
//        sf.close();
//        System.out.println(s2);


        // To update data follow below code

//            Student s3 = new Student();
//            s3.setsName("Anika");
//            s3.setRollNo(4);
//            s3.setsAge(17);
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.Hibernate.Student.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//        session.merge(s3); // To update the data we use merge, if the given data is not there to update then it automatically creates a new entry in database
//        merge command basically fetched and updates the data

        //Now since the data is fetched and updated by the hibernate , now hibernate again needs to store the data se here we use now transaction

//        Transaction transaction = session.beginTransaction();
//        transaction.commit();
//        session.close();
//        sf.close();


        // To delete the data follow th below code

//        Student s1 = new Student();
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.Hibernate.Student.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//        s1 = session.get(Student.class,106);
//
//        // here also we will need transacion as anywhich ways the data is altered (created,updated or deleted) in database
//
//        Transaction transaction = session.beginTransaction();
//        session.remove(s1);
//        transaction.commit();
//        sf.close();


        // To update the column names we have created a new class named as programmer

        Programmer p1 = new Programmer();
        p1.setPid(101);
        p1.setPname("Rohan");
        p1.setTech("Java");

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.Hibernate.Programmer.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction(); //Transaction is needed when we are providing data to the database, for fetching we don't need it
        session.persist(p1); // To store the data in database we use persist
        transaction.commit();
        session.close();
        sf.close();

        // above we have created a new class Programmer and its object so a new table is created
        // As the class is the entity whose name is given to the table but if we do not need to touch the class name still
        // we need to change the table name as table is the class name only so there is the concept to be done

        //so for this we have used @Table annotation in Programmer class top where the table name is given



    }
}