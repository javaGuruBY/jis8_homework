package com.tutrit.java.quickstart.service;

import static org.junit.Assert.*;

import com.tutrit.java.quickstart.bean.Human;
import com.tutrit.java.quickstart.constant.Sex;
import java.util.stream.IntStream;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EnumDemoTest {

    EnumDemo enumDemo;
    Logger log = LoggerFactory.getLogger(EnumDemoTest.class);

    @Before
    public void setUp() {
        enumDemo = new EnumDemo();
    }
    @Test
    public void run() {
        IntStream.range(0, 10000000).boxed().
                forEach(i -> enumDemo.run(new Human("max", 37, Sex.M)));

        IntStream.range(0, 500000).boxed().
                forEach(i -> enumDemo.run(new Human("max", 37, Sex.F)));

        assertEquals(10000000, enumDemo.getTotal(Sex.M));
        assertEquals(500000, enumDemo.getTotal(Sex.F));
    }

    @Test
    public void syntax() {
        var human = new Human("max", 37, Sex.M);
        log.info(human.toString());
    }
}