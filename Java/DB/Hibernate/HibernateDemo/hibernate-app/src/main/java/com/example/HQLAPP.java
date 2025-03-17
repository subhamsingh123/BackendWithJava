package com.example;

import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.Random;


public class HQLAPP {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
//
//        Random rand = new Random();
//        for(int i =1;i<50;i++)
//        {
//            Student student = new Student();
//            student.setName("Name"+i);
//            student.setMarks(rand.nextInt(100));
//            student.setRollNo(i);
//            session.save(student);
//        }

//        Query q = session.createQuery("From Student where marks>50");
//        List<Student> studentList  = q.list();
//        for(Student s : studentList)
//        {
//            System.out.println(s);
//        }
//
        Student student = new Student();
        student.setName("Testing Persist After Save");
            student.setMarks(100);
            student.setRollNo(100);
       session.save(student);

       student.setMarks(1011);
        session.getTransaction().commit();

    }
}
