package com.github.pavelbopavel;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class WrapperDemoTest {
    Logger log;

    @Before
    public void setUp(){
        log = LoggerFactory.getLogger(WrapperDemoTest.class);
    }
    @Test
    public void immutableDemo(){
        Integer i1 = 10;
        Integer i2 = i1;
        assertEquals(i1.hashCode(), i2.hashCode());
        i2 = 5;
        assertNotEquals(i1.hashCode(), i2.hashCode());
    }

    @Test
    public void  intejerToOctal(){
        assertEquals("12", Integer.toString(10,8));
    }

    @Test
    public void  intejerToHex(){
        assertEquals("a", Integer.toString(10,16));
    }

    @Test
    public void  intejerToBinary(){
        assertEquals("1010", Integer.toString(10,2));
    }
}
