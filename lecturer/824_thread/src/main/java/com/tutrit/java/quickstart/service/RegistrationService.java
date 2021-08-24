package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Course;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistrationService implements Runnable{
    Logger log = LoggerFactory.getLogger("RegistrationService");
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
            new Course().notifyClient(time);
        }
    }
}
