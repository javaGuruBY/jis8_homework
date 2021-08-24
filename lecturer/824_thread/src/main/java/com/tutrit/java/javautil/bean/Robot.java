package com.tutrit.java.javautil.bean;

import java.time.LocalDateTime;
import java.util.Observable;
import java.util.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Robot implements Observer {

    Logger logger = LoggerFactory.getLogger("Robot");
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.update((LocalDateTime) arg);
    }

    public void update(LocalDateTime time) {
        logger.info("{} got updates! Time is {}", name, time.toString());
    }
}
