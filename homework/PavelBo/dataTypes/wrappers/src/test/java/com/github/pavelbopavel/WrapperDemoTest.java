package com.github.pavelbopavel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
        Assert.assertEquals(i1.hashCode(), i2.hashCode());
        i2 = 5;
        Assert.assertNotEquals(i1.hashCode(), i2.hashCode());
    }

    @Test
    public void  intejerToOctal(){
        Assert.assertEquals("12", Integer.toString(10,8));
    }

    @Test
    public void  intejerToHex(){
        Assert.assertEquals("a", Integer.toString(10,16));
    }

    @Test
    public void  intejerToBinary(){
        Assert.assertEquals("1010", Integer.toString(10,2));
    }

}