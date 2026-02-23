package com.neerad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Neerad");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Daksh");

        Laptop laptop1 = new Laptop();
        laptop1.setLid(101);
        laptop1.setLname("Acer");
        laptop1.getStudent().add(student1);
        laptop1.getStudent().add(student2);

        Laptop laptop2 = new Laptop();
        laptop2.setLid(102);
        laptop2.setLname("HP");
        laptop2.getStudent().add(student1);
        laptop2.getStudent().add(student2);

        Laptop laptop3 = new Laptop();
        laptop3.setLid(103);
        laptop3.setLname("Dell");
        laptop3.getStudent().add(student1);


        student1.getLaptop().add(laptop1);
        student1.getLaptop().add(laptop2);
        student1.getLaptop().add(laptop3);

        student2.getLaptop().add(laptop1);
        student2.getLaptop().add(laptop2);

        SessionFactory factory = new Configuration()
                                 .addAnnotatedClass(com.neerad.Student.class)
                                 .addAnnotatedClass(com.neerad.Laptop.class)
                                 .configure("hibernate.cfg.xml")
                                 .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student1);
        session.persist(student2);
        tx.commit();

        session.close();
        factory.close();
    }
}
