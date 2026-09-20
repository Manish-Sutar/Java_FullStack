package org.example.transistExample;

import org.example.onetoonemapping.Laptop;
import org.example.onetoonemapping.User1;
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
        System.out.println(p);
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Product.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();


        // Start Transaction
        Transaction transaction = session.beginTransaction();

        session.persist(p);
        transaction.commit();
    }
}
