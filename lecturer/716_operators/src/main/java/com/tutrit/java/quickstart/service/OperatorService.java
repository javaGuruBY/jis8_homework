package com.tutrit.java.quickstart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperatorService {

    public void run(int a, int b) {
        Logger log = LoggerFactory.getLogger("OperatorService");
        log.info("OperatorService.run()");
        log.info("{} + {} = {}", a, b, a + b);
    }
}
