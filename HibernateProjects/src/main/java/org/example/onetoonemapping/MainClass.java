package org.example.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        // Create User object
        User1 user = new User1();

        user.setId(1);
        user.setName("Abhishek");
        user.setTech("Dev");
        user.setSal(60000);




        // Create Laptop object
        Laptop laptop = new Laptop();

        laptop.setId(101);
        laptop.setName("HP");
        laptop.setRam(16);

        System.out.println(laptop);


        // Connect User with Laptop
        user.setLaptop(laptop);
        System.out.println(user);


        // Hibernate Configuration
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(User1.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();


        // Open Session
        Session session = sf.openSession();


        // Start Transaction
        Transaction transaction = session.beginTransaction();


        // Save User
        session.persist(user);

        // Save Laptop
        session.persist(laptop);


        // Commit Transaction
        transaction.commit();


        // Close resources
        session.close();
        sf.close();
    }
}