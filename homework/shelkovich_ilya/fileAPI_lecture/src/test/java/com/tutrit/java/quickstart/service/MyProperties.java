package com.tutrit.java.quickstart.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {

    Logger log = LoggerFactory.getLogger(MyProperties.class);

    @Test
    public void readProperties() throws IOException {
        var properties = new Properties();
        var propertiesXml = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("prop.properties"));
        propertiesXml.loadFromXML(getClass().getClassLoader().getResourceAsStream("prop.xml"));

        log.info("xml {} . properties {}", propertiesXml, properties);

        properties.setProperty("bot", "http://localhost:8080");
        properties.store(new FileOutputStream("prop.properties"), "New properties");
    }

    @Test
    public void log4g() {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("log4g");
        logger.error("this is info", new Exception());
        logger.info("All fine {}", "max");
    }
}
