package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForOddChecker {
    static Logger log = LoggerFactory.getLogger(DoWhileOddChecker.class);
    public  static void oddChecker (){
       for(int i = 0; i <= 50; i++) {
            if ((i % 2) == 1) {
                log.info("{}", i);
            }
        }
    }
}
