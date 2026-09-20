package org.example.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        // Laptop 1
        Laptops laptop1 = new Laptops();
        laptop1.setId(1);
        laptop1.setName("HP");
        laptop1.setRam(12);


        // Laptop 2
        Laptops laptop2 = new Laptops();
        laptop2.setId(2);
        laptop2.setName("Dell");
        laptop2.setRam(8);


        // Laptop 3
        Laptops laptop3 = new Laptops();
        laptop3.setId(3);
        laptop3.setName("Acer");
        laptop3.setRam(6);


        // User 1
        Users2 user = new Users2();
        user.setId(1);
        user.setName("Ansh");
        user.setTech("Test");


        // User 2
        Users2 user1 = new Users2();
        user1.setId(2);
        user1.setName("Om");
        user1.setTech("Dev");


        // One user has multiple laptops
        user.setLaptops(
                Arrays.asList(laptop1, laptop2, laptop3)
        );


        // Hibernate Configuration
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Users2.class)
                .addAnnotatedClass(Laptops.class)
                .configure()
                .buildSessionFactory();


        // Open Session
        Session session = sf.openSession();


        // Start Transaction
        Transaction transaction = session.beginTransaction();


        // Save laptops
        session.persist(laptop1);
        session.persist(laptop2);
        session.persist(laptop3);


        // Save users
        session.persist(user);
        session.persist(user1);


        // Commit
        transaction.commit();


        // Close
        session.close();
        sf.close();
    }
}