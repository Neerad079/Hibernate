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
        student.setTech("Python");


        SessionFactory factory = new Configuration()
                                 .addAnnotatedClass(com.neerad.Student.class)
                                 .configure("hibernate.cfg.xml")
                                 .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(student);
        tx.commit();

        session.close();
        factory.close();
    }
}
