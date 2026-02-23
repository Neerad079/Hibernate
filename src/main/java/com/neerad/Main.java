package com.neerad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(4);
        student.setName("Neerad");
        Laptop laptop = new Laptop();
        laptop.setLid(102);
        laptop.setLname("HP");
        student.setLaptop(laptop);

        SessionFactory factory = new Configuration()
                                 .addAnnotatedClass(com.neerad.Student.class)
                                 .addAnnotatedClass(com.neerad.Laptop.class)
                                 .configure("hibernate.cfg.xml")
                                 .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        session.persist(laptop);
        tx.commit();

        session.close();
        factory.close();
    }
}
