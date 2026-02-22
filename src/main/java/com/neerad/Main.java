package com.neerad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(101);
        student.setName("Neerad");
        student.setTech("Java");

        // saving student object with hibernate

        Configuration config = new Configuration().configure();
        config.addAnnotatedClass(com.neerad.Student.class);
        SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();
    }
}
