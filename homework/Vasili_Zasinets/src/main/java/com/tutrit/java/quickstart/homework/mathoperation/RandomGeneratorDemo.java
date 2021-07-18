package com.tutrit.java.quickstart.homework.mathoperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGeneratorDemo {
    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger("MathRandom");
        float a = (float) (Math.random() * 10);
        log.info("Random a {}", a);
        float b = (float) (Math.random() * 20);
        log.info("Random b {}", b);
        float c = (float) (Math.random() * 33);
        log.info("Random c {}", c);
        float sum = a + b + c;
        log.info("Sum a+b+c {}", sum);
    }
}
