package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicBallTest {

    MagicBall magicBall;

    @Before
    public void setUp(){
        this.magicBall = new MagicBall();
    }

    @Test
    public void addPrediction() {
        Assert.assertNotNull(magicBall.predictionsMap());
    }

    @Test
    public void numberOfPrediction() {
        //didn't get how to test this method

    }

    @Test
    public void prediction() {
        //didn't get how to test this method
    }
}
