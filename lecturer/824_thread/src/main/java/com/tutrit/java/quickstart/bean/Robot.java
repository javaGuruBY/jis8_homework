package com.tutrit.java.quickstart.bean;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Robot implements ClientObserver {

    Logger logger = LoggerFactory.getLogger("Robot");
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void update(LocalDateTime time) {
        logger.info("{} got updates! Time is {}", name, time.toString());
    }
}
