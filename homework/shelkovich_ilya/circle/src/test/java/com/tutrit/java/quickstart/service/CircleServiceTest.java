package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Circle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleServiceTest {

    Circle circle;
    CircleService circleService;

    @Before
    public void setUp(){
        this.circle = new Circle(4);
        this.circleService = new CircleService();
    }

    @Test
    public void calculateArea() {
        double expected = Math.PI * circle.getRadius() * circle.getRadius();
        double actual = circleService.calculateArea(circle);
        double delta = 0;
        Assert.assertEquals(expected, actual, delta);
    }
}
