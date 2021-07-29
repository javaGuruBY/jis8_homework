package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColorDetectorTest {

    ColorDetector colorDetector;

    @Before
    public void setUp() {
        this.colorDetector = new ColorDetector();
    }

    @Test
    public void detect() {
        int waveLength = 450;
        Assert.assertEquals("Blue", colorDetector.detect(waveLength));

        int waveLength2 = 619;
        Assert.assertEquals("Orange", colorDetector.detect(waveLength2));

        int waveLengthInvisible = 379;
        Assert.assertEquals("Invisible Light", colorDetector.detect(waveLengthInvisible));
    }
}
