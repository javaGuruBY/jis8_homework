package com.tutrit.java.quickstart.config;

import com.tutrit.java.quickstart.dao.JBossDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JisAtLocalhost {
    private static Connection connection;
    private static Logger log = LoggerFactory.getLogger(JBossDao.class);

    public static Connection getConnection() throws Exception {
        try {
            if(connection == null || connection.isClosed()) {

                Properties properties = new Properties();
                try (InputStream in = new FileInputStream("src/main/resources/application.properties")) {
                    properties.load(in);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                connection = DriverManager.getConnection(
                        properties.getProperty("URL"),
                        properties.getProperty("USER"),
                        properties.getProperty("PASS"));
            }
        } catch (Exception ex) {
            log.error("Cannot connect to database", ex);
            throw new Exception();
        }
        return connection;
    }
}
