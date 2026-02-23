package com.neerad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Neerad");
        Laptop laptop1 = new Laptop();
        laptop1.setLid(101);
        laptop1.setLname("Acer");
        laptop1.setStudent(student);

        Laptop laptop2 = new Laptop();
        laptop2.setLid(102);
        laptop2.setLname("HP");
        laptop2.setStudent(student);

        Laptop laptop3 = new Laptop();
        laptop3.setLid(103);
        laptop3.setLname("Dell");
        laptop3.setStudent(student);

        student.getLaptop().add(laptop1);
        student.getLaptop().add(laptop2);
        student.getLaptop().add(laptop3);

        SessionFactory factory = new Configuration()
                                 .addAnnotatedClass(com.neerad.Student.class)
                                 .addAnnotatedClass(com.neerad.Laptop.class)
                                 .configure("hibernate.cfg.xml")
                                 .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();

        session.close();
        factory.close();
    }
}
