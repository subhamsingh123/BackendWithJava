package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        // Create EntityManagerFactory once for the application
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");

        // Create EntityManager for database operations
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Start a transaction
        entityManager.getTransaction().begin();

//         Creating an Alien object and persisting it
//        Alien a = new Alien();
//        a.setaId(1);
//        a.setaName("Subham");
//        a.setTech("Java");

       Alien a =  entityManager.find(Alien.class,1);
//        entityManager.persist(a);

//        entityManager.getTransaction().commit(); // Commit transaction

        System.out.println(a);

        // Close EntityManager
        entityManager.close();
        entityManagerFactory.close(); // Close factory at the end of the program
    }
}
