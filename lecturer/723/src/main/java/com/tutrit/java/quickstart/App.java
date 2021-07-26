package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.MyMath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger("App");

    public static void main(String[] args) throws Exception {
        try {
            MyMath.run(args);
        } catch (Exception e) {
            log.info(e.getMessage());
            log.trace("exception ", e);
        }
    }
}

