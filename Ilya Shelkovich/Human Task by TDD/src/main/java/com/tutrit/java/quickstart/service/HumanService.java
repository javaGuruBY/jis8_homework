package com.tutrit.java.quickstart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanService {

    Logger log = LoggerFactory.getLogger("HumanService");

    public void greet(String name, int age) {
        log.info("My name is {},  I'm  {} years old", name, age);
    }
}
