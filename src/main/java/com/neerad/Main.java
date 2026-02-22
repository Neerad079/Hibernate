package com.neerad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(103);
        student.setName("Daksh");
        student.setTech("Gen Ai");


        SessionFactory factory = new Configuration()
                                 .addAnnotatedClass(com.neerad.Student.class)
                                 .configure("hibernate.cfg.xml")
                                 .buildSessionFactory();

        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction(); // used for when saving, updating and deleting
//        session.persist(student); used for saving into the database , not needed when fetching from the data
//        tx.commit();
        Student s1=session.get(Student.class, 103);
        System.out.println(s1);
        session.close();
        factory.close();
    }
}
