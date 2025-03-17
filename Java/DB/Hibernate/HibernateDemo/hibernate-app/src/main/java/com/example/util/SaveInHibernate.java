package com.example.util;

import com.example.Alien;
import com.example.entity.Laptop;
import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveInHibernate {


    public static void save(Session session , Object alien){
            session.save(alien);
    }
}
