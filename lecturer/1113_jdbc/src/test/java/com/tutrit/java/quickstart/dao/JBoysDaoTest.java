package com.tutrit.java.quickstart.dao;

import org.junit.Test;

public class JBoysDaoTest {

    @Test
    public void createTableJBoss() {
        JBoysDao jBoysDao = new JBoysDao();
        jBoysDao.createTableJBoys();
    }

    @Test
    public void dropTableJBoss() {
        JBoysDao jBoysDao = new JBoysDao();
        jBoysDao.dropTableJBoys();
    }
}