package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhileOddChecker {
    static Logger log = LoggerFactory.getLogger(DoWhileOddChecker.class);
    public  static void oddChecker (){
        int i = 0;
        while (i <= 50) {
            if ((i % 2) == 1) {
                log.info("{}", i);
            }
            i++;
        }
    }
}
