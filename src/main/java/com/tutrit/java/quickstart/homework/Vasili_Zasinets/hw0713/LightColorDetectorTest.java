package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713;

import com.tutrit.java.quickstart.LightColorDetector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightColorDetectorTest {
    LightColorDetector lightColorDetector;

    @Before
    public void setUp() {
        lightColorDetector = new LightColorDetector();
    }

    @Test
    public void detect() {
        assertEquals( "Red",lightColorDetector.detect(720));
    }
}