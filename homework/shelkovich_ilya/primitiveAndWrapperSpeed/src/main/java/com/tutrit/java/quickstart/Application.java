package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.Sum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        var sum = new Sum();

        log.info("Time to count primitives {}", sum.timeForCountPrimitive());
        log.info("Time to count wrapper {}", sum.timeForCountWrapper());
    }
}

