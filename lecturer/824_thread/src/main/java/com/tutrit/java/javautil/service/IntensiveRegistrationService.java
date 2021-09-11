package com.tutrit.java.javautil.service;

import com.tutrit.java.javautil.bean.IntensiveCourse;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntensiveRegistrationService implements Runnable{
    Logger log = LoggerFactory.getLogger("IntensiveRegistrationService");
    boolean stop = true;

    @Override
    public void run() {
        while (stop) {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.interrupted();
            }
            LocalDateTime time = LocalDateTime.now();
            log.info("time updated: current time is {}", time);
            new IntensiveCourse().notifyObservers(time);
        }
    }
}