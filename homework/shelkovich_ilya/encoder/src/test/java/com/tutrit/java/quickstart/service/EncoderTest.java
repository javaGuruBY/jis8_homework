package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncoderTest {

    Encoder encoder;
    short a;
    char b;

    @Before
    public void setUp(){
        this.encoder = new Encoder();
        this.a = 65;
        this.b = 'A';
    }

    @Test
    public void encode() {
        char expected = 'A';
        char actual = encoder.encode(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decode() {
        short expected = 65;
        short actual = encoder.decode(b);
        Assert.assertEquals(expected, actual);
    }
}
