package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TransactionHelper {

    EntityManager entityManager;

    {
        entityManager = Persistence.createEntityManagerFactory("test").createEntityManager();
    }

    public EntityManager getEntiteManager() {
        return entityManager;
    }

    public void closeTransaction() {
        entityManager.close();
    }

}
