package com.tutrit.java.quickstart.bean;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Human implements ClientObserver {

    Logger logger = LoggerFactory.getLogger("Human");
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void update(LocalDateTime time) {
        logger.info("{} got updates! Time is {}", name, time.toString());
    }
}
