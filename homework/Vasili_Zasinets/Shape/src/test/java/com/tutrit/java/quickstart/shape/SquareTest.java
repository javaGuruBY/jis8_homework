package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    ShapeService shapeService = new ShapeService(Fabric.getNewShape("Square"));
    AbstractShape squareTest = shapeService.createShape("SquareTest", 5);
    AbstractShape squareTestException = shapeService.createShape("SquareTestException", -6);

    @Test
    public void getArea() throws ShapeLengthException {
        assertEquals(25, squareTest.getArea(), 0.000);
    }

    @Test
    public void perimeter() throws ShapeLengthException {
        assertEquals(20, squareTest.perimeter(), 0.000);
    }

    @Test
    public void getName() {
        assertEquals("SquareTest", squareTest.getName());
    }

    @Test
    public void circumference() throws ShapeLengthException {
        assertEquals(0, squareTest.circumference(), 0);
    }

    @Test(expected = ShapeLengthException.class)
    public void perimeterException() throws ShapeLengthException {
        squareTestException.perimeter();
    }

    @Test(expected = ShapeLengthException.class)
    public void getAreaException() throws ShapeLengthException {
        squareTestException.getArea();
    }
}
