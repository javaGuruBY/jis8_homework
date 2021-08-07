package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    ShapeService shapeService = new ShapeService(Fabric.getNewShape("Circle"));
    AbstractShape circleTest = shapeService.createShape("CircleTest", 6);
    AbstractShape circleTestException = shapeService.createShape("CircleTestException", -6);

    @Test
    public void Circumference() throws ShapeLengthException {
        double expected = 37.7;
        assertEquals(expected, circleTest.circumference(), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("CircleTest", circleTest.getName());
    }

    @Test
    public void getArea() throws ShapeLengthException {
        double expected = 113.097;
        assertEquals(expected, circleTest.getArea(), 0.0004);
    }

    @Test
    public void Perimeter() throws ShapeLengthException {
        assertEquals(0, circleTest.perimeter(), 0);
    }

    @Test(expected = ShapeLengthException.class)
    public void CircumferenceException() throws ShapeLengthException {
        circleTestException.circumference();
    }

    @Test(expected = ShapeLengthException.class)
    public void GetAreaException() throws ShapeLengthException {
        circleTestException.getArea();
    }

}
