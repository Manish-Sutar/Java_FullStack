package org.example.embbeded;

import org.example.onetomany.Users2;
import org.example.transistExample.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
    public static void main(String[] args) {
        Product p =new Product();
        p.setId(1);
        p.setName("a");
        p.setRam(8);
        p.setStock(95);

        user3 user = new user3();
        user.setId(1);
        user.setName("Ansh");
        user.setTech("Test");

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(user3.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();


        // Start Transaction
        Transaction transaction = session.beginTransaction();

        session.persist(user);
        session.persist(p);
        transaction.commit();
    }
}
