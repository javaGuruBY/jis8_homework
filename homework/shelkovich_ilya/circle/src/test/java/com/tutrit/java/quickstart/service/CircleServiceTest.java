package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Circle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleServiceTest {

    Circle circle;
    CircleService circleService;
    double radius;

    @Before
    public void setUp(){
        this.circle = new Circle();
        this.circleService = new CircleService();
        this.radius = 4.5;
    }

    @Test
    public void calculateArea() {
        double r = radius;
        double expected = Math.PI * r * r;
        double actual = circleService.calculateArea(r);
        double delta = 2;
        Assert.assertEquals(expected, actual, delta);
    }
}
