package com.github.pavelbopavel;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;


public class WrapperDemoTest {
    Logger log = LoggerFactory.getLogger(WrapperDemoTest.class);

    @Before
    public void setUp(){

    }
    @Test
    public void immutableDemo(){
        String str1 = "str1";
        int str1Int = str1.hashCode();
        str1 += " change";
        int str1ChangeInt = str1.hashCode();
        boolean result = str1Int ==str1ChangeInt;
        assertFalse(result);
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