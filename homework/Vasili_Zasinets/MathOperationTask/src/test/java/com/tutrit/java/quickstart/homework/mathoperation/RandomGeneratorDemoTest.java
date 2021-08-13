package com.tutrit.java.quickstart.homework.mathoperation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGeneratorDemoTest {
    RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();

    @Test
    public void randomGenerator() {
        Logger log = LoggerFactory.getLogger("MathRandom");
        log.info("Random a {}", randomGeneratorDemo.randomGeneratorA());
        log.info("Random b {}", randomGeneratorDemo.randomGeneratorB());
        log.info("Random c {}", randomGeneratorDemo.randomGeneratorC());
        log.info("Sum a+b+c {}", randomGeneratorDemo.SumRandom());
    }
}
