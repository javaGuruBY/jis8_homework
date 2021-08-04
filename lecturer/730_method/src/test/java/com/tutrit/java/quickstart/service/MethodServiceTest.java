package com.tutrit.java.quickstart.service;

import static org.junit.Assert.*;

import com.tutrit.java.quickstart.bean.MyInteger;
import org.junit.Before;
import org.junit.Test;

public class MethodServiceTest {

    MethodService methodService;

    @Before
    public void setUp() {
        methodService = new MethodService();
    }

    @Test
    public void modifyInt() {
        int victim = 1;
        methodService.modifyInt(victim);
        assertEquals(1, victim);
    }

    @Test
    public void testModifyInt() {
        MyInteger victim = new MyInteger(1);
        methodService.modifyInt(victim);
        assertEquals(new MyInteger(2), victim);
    }

    @Test
    public void testModifyAndReturnInt1() {
        MyInteger victim = new MyInteger(1);
        methodService.modifyAndReturnInt1(victim);
        assertEquals(new MyInteger(2), victim);
    }

    @Test
    public void testModifyAndReturnInt2() {
        MyInteger victim = new MyInteger(1);
        methodService.modifyAndReturnInt2(victim);
        assertEquals(new MyInteger(2), victim);
    }

    @Test
    public void testModifyAndReturnInt3() {
        MyInteger victim = new MyInteger(1);
        MyInteger expected = methodService.modifyAndReturnInt1(victim);
        assertEquals(new MyInteger(2), expected);
    }

    @Test
    public void testModifyAndReturnInt4() {
        MyInteger victim = new MyInteger(1);
        MyInteger expected = methodService.modifyAndReturnInt2(victim);
        assertEquals(new MyInteger(2), expected);
    }

    @Test
    public void test2ModifyInt() {
        Integer victim = 1;
        methodService.modifyInt(victim);
        assertEquals(new Integer(1), victim);
    }
}