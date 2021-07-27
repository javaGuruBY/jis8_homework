package com.tutrit.java.quickstart.homework.encoder;

import org.junit.Assert;
import org.junit.Test;

public class EncoderTest {
    Encoder encoder = new Encoder();

    @Test
    public void decode() {
        Assert.assertEquals(88, encoder.decode('X'));
    }

    @Test
    public void encode() {
        Assert.assertEquals('A', encoder.encode(65));
    }
}
