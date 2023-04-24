package com.example.Mahiro.hibernate_test;

import com.example.Mahiro.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Exception.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Matvey", "Postnikov",
                    "IT", 500);

            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }
    }
}
