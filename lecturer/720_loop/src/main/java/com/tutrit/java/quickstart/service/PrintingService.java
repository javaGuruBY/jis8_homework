package com.tutrit.java.quickstart.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintingService implements Runnable {
    public static boolean doTheJob = true;
    private Logger log = LoggerFactory.getLogger(PrintingService.class);

    public void run() {
        while (doTheJob) {
            log.info("I do!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void iteratorWhile() {
        Set s = new HashSet();
        s.add("a");
        s.add("bb");
        s.add("ccc");

        Iterator it = s.iterator();

        while (it.hasNext()) {
            Object value = it.next();
            log.info("{}", value); //do something with each value
        }
    }
}
