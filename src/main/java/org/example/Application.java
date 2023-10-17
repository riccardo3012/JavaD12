package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static String persistenceUnitName;
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaD12");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");

    }
}
