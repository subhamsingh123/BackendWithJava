package com.example.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateConfig {

    @Autowired
    protected static SessionFactory sessionFactory;

    protected static Session getCurrentSession() {
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
        }catch(HibernateException e) {
            session = sessionFactory.openSession();
        }
        return session;
    }
}
