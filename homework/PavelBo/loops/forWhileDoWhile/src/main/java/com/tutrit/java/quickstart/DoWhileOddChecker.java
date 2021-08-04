package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoWhileOddChecker {
    static Logger log = LoggerFactory.getLogger(DoWhileOddChecker.class);
    public  static void oddChecker (){
        int i = 0;
        do {
            if ((i % 2) == 1) {
                log.info("{}", i);
            }
            i++;
        } while (i < 50);
    }
}
