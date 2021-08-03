package com.tutrit.java.quickstart.model;

import com.tutrit.java.quickstart.bean.Human;
import org.junit.Test;

public class PunkTest extends Human {

    @Test
    public void secretName() {
        new Punk().secretName();
    }

    @Test
    public void getNameTest() {
        new Punk().getName();
    }

    @Test
    public void getOutTest() {
        new Punk().yesPunkGetOut();
    }

    @Test
    public void getProtected() {
        new PunkTest().getOut();
    }

    @Test
    public void debug() {
        Punk punk = new Punk();
        System.out.println("punk = " + punk);
    }

    @Test
    public void testToString() {
        System.out.println("new Punk() = " + new Punk());
    }

    @Test
    public void testToStringDemo() {
        new Punk().toStringDemo();
    }

    @Test
    public void getNickTest() {
        new Punk();
    }
}
