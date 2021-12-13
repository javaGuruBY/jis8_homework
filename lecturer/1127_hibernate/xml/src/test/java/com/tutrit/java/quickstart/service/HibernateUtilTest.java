package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HibernateUtilTest {

    @Test
    public void getSessionFactory() {
        Assert.assertTrue(HibernateUtil.getSessionFactory() != null);
    }
}