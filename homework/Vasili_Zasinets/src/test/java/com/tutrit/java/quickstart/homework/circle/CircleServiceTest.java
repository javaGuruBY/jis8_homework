package com.tutrit.java.quickstart.homework.circle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleServiceTest {

    Circle circle;
    CircleService circleService;

    @Before
    public void setUp() {
        this.circle = new Circle(5);
        this.circleService = new CircleService();
    }

    @Test
    public void calculateArea() {
        double expected = Math.PI * 5 * 5;
        Assert.assertEquals(expected, circleService.calculateArea(circle), 0.00);
    }
}
