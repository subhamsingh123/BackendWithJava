package com.example;

import com.example.entity.Laptop;
import com.example.entity.Student;
import com.example.util.GetFromHibernate;
import com.example.util.SaveInHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Aname name = new Aname();
//        name.setFirstName("Subham");
//        name.setMiddleName("Middle");
//        name.setLastName("Singh");
//
//
//        Alien telusko = new Alien();
//        telusko.setaId(103);
//        telusko.setaName(name);
//        telusko.setaColor("Yellow");
//     SaveInHibernate.save(telusko);

//        GetFromHibernate.get(102);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
        Laptop laptop= new Laptop();
        laptop.setLid(1);
        laptop.setlName("Dell");

//        Laptop laptop2= new Laptop();
//        laptop.setLid(2);
//        laptop.setlName("Apple");
//
//        Laptop laptop3= new Laptop();
//        laptop.setLid(3);
//        laptop.setlName("HP");

        Student student=new Student();

        student.setRollNo(1);
        student.setName("Subham");
        student.setMarks(100);
//        student.setLaptop(Arrays.asList(laptop
////                ,laptop2,laptop3
//        ));
//            student.getLaptop().add(laptop);

            laptop.getStudent().add(student);

        SaveInHibernate.save(session,laptop);
//        SaveInHibernate.save(session,laptop2);
//        SaveInHibernate.save(session,laptop3);
        SaveInHibernate.save(session,student);

        session.getTransaction().commit();
        }
        catch (Exception e )
        {
            System.out.println(e);
        }



    }

    public static Student Queries(Session session, String query){

        Query Q = session.createQuery(query);
        return (Student) Q.uniqueResult();
    }
}
