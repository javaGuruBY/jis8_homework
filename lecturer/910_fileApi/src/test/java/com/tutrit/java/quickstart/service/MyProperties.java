package com.tutrit.java.quickstart.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class MyProperties {

    @Test
    public void readProperties() throws IOException {
        var properties = new Properties();
        var propertiesXml = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("prop.properties"));
        propertiesXml.loadFromXML(getClass().getClassLoader().getResourceAsStream("prop.xml"));

        LoggerFactory.getLogger("").info("xml {} .properties {}", propertiesXml, properties);

        properties.setProperty("botUrl", "http://localhost:8080/bot");
        properties.store(new FileOutputStream("prop.properties"), "New properties");
    }
}
