package com.tutrit.java.quickstart.config;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class JisAtLocalhostTest {

    @Test
    public void getConnection() throws Exception {
        assertEquals("JIS", JisAtLocalhost.getConnection().getCatalog());
    }
}