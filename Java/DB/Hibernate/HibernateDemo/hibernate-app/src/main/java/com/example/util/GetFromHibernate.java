package com.example.util;

import com.example.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetFromHibernate {

    public static void get(int alienId){
        Alien alien= new Alien();
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();
            alien= session.get(Alien.class,alienId);
        }
        catch (Exception e )
        {
            System.out.println(e);
        }

        System.out.println(alien);

    }
}
