package com.tutrit.java.quickstart.homework.ball;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicTest {
    Magic magic;
    Logger log = LoggerFactory.getLogger("Ball");

    @Before
    public void setUp() {
        this.magic = new Magic();
    }

    @Test
    public void addPredict() {
        Assert.assertNotNull(magic.getBall());
    }

    @Test
    public void number() {
        log.info("Number {}", magic.number());
    }

    @Test
    public void predict() {
     magic.predict();
    }
}
