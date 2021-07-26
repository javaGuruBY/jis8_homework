package com.tutrit.java.quickstart.service;

import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMath {
    static Logger log = LoggerFactory.getLogger("MyMath");

    public static void run(String[] args) throws Exception {
        try {
            log.info("sum is {}", args[1] + args[0]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new MyMaxException(
                    String.format("There is not enough elements. Should be 2, but got %s", args.length),
                    exception);
        }
    }

    public static void finallyExample() throws Exception {
        try {
            if (ThreadLocalRandom.current().nextBoolean()) {
                throw new MyMaxException();
            }
        } finally {
            log.info("finally block");
        }
    }
}
