package com.tutrit.java.quickstart.service;

import static org.junit.Assert.assertEquals;

import com.tutrit.java.quickstart.Human;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncoderTest {

    Encoder encoder;
    Logger log = LoggerFactory.getLogger(EncoderTest.class);

    @Before
    public void setUp() {
        encoder = new Encoder();
        log.info("create new encoder {}", encoder);
    }

    @Test
    public void testDecode() {
        assertEquals(88, encoder.decode('X'));
    }

    @Test
    public void testEncode() {
        assertEquals('A', encoder.encode((short) 65));
    }


    @Test
    public void makeVictimHuman() {
        int x = 2;
        x = x + 4;
        x += 4;
        System.out.println(x);
    }
}