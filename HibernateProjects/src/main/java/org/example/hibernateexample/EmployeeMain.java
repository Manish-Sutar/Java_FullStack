package org.example.hibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // Retrieve all employees
        List<Employee> employees =
                session.createQuery("from Employee", Employee.class)
                        .getResultList();

        // Print employees
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        transaction.commit();


        SessionFactory sf1= new Configuration().addAnnotatedClass(org.example.hibernateexample.Employee.class).configure().buildSessionFactory();

        Session s1=sf1.openSession();
        Employee emp2 = session.find(Employee.class,104);
        System.out.println(emp2);

        session.close();
        sessionFactory.close();

    }
}