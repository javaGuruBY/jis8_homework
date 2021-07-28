package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Circle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleServiceTest {

    CircleService circleService;

    @Before
    public void setUp(){
        this.circleService = new CircleService();
    }

    @Test
    public void calculateArea() {
        Circle circle = new Circle(4);
        double expected = 50.26;
        double actual = circleService.calculateArea(circle);
        double delta = 2;
        Assert.assertEquals(expected, actual, delta);
    }
}
