package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import java.util.Arrays;
import java.util.List;

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

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam("16GB");
//
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("HP");
//        l2.setModel("Pavillion");
//        l2.setRam("8GB");
//
//        Laptop l3 = new Laptop();
//        l3.setLid(3);
//        l3.setBrand("Apple");
//        l3.setModel("MacBookAir");
//        l3.setRam("28GB");
//
//
//        Programmer p1 = new Programmer();
//        p1.setPid(101);
//        p1.setPname("Rohan");
//        p1.setTech("Java");
////        p1.setLaptop(l1); // this wil be used in case of OneToOne
//
//
//        Programmer p2 = new Programmer();
//        p2.setPid(102);
//        p2.setPname("Harsh");
//        p2.setTech("Python");
//
//        Programmer p3 = new Programmer();
//        p3.setPid(103);
//        p3.setPname("Kiran");
//        p3.setTech("AI");
//
//        p1.setLaptops(List.of(l1,l2));
//        p2.setLaptops(List.of(l1,l3));
//        p3.setLaptops(List.of(l1,l2,l3));
//
//        l1.setProgrammers(List.of(p1,p2,p3));
//        l2.setProgrammers(List.of(p1,p3));
//        l3.setProgrammers(List.of(p2,p3));
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.Hibernate.Programmer.class)
//                .addAnnotatedClass(com.Hibernate.Laptop.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction(); //Transaction is needed when we are providing data to the database, for fetching we don't need it
//
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//        session.persist(p1); // To store the data in database we use persist
//        session.persist(p2);
//        session.persist(p3);
//        transaction.commit();
//
//        Programmer p4 = session.get(Programmer.class,101);
//        System.out.println(p2);
//
//
//        session.close();
//        sf.close();

        // above we have created a new class Programmer and its object so a new table is created
        // As the class is the entity whose name is given to the table but if we do not need to touch the class name still
        // we need to change the table name as table is the class name only so there is the concept to be done
        //so for this we have used @Table annotation in Programmer class top where the table name is given

        //----------------------------------------------------------------------//

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("ROX");
        l1.setRam("32GB");
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.Hibernate.Programmer.class)
                .addAnnotatedClass(com.Hibernate.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        // for fetching the data we don't use transaction
//        Transaction transaction = session.beginTransaction(); //Transaction is needed when we are providing data to the database, for fetching we don't need it
//        session.persist(l1);
//        transaction.commit();

        Query query = (Query) session.createQuery("from Laptop where brand like 'Asus");
//        List<Laptop> laptops = query.getResultList();
        session.close();
        sf.close();

    }

}