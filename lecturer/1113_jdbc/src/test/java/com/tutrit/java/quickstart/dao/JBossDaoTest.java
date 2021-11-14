package com.tutrit.java.quickstart.dao;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class JBossDaoTest {

    @Test
    public void createTableJBoss() {
        JBossDao jBossDao = new JBossDao();
        jBossDao.createTableJBoss();
    }

    @Test
    public void dropTableJBoss() {
        JBossDao jBossDao = new JBossDao();
        jBossDao.dropTableJBoss();
    }
}