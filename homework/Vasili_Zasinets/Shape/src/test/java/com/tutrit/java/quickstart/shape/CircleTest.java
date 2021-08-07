package com.tutrit.java.quickstart.shape;

import com.tutrit.java.quickstart.shape.facade.Facade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void circumference() throws ShapeLengthException {
        assertEquals(37.7, Facade.facadeForShape("Circle", "CircleTest", 6).circumference(), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("CircleTest", Facade.facadeForShape("Circle", "CircleTest", 6).getName());
    }

    @Test
    public void getArea() throws ShapeLengthException {
        assertEquals(113.097, Facade.facadeForShape("Circle", "CircleTest", 6).getArea(), 0.0004);
    }

    @Test
    public void perimeter() throws ShapeLengthException {
        assertEquals(0, Facade.facadeForShape("Circle", "CircleTest", 6).perimeter(), 0);
    }

    @Test(expected = ShapeLengthException.class)
    public void circumferenceException() throws ShapeLengthException {
        Facade.facadeForShape("Circle", "CircleTest", -6).circumference();
    }

    @Test(expected = ShapeLengthException.class)
    public void getAreaException() throws ShapeLengthException {
        Facade.facadeForShape("Circle", "CircleTest", -7).getArea();
    }

}
