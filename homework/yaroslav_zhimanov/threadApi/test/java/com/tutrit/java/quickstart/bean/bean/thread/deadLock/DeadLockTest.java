package com.tutrit.java.quickstart.bean.bean.thread.deadLock;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeadLockTest {

    @Test
    public void perform() {
        var deadLock = new DeadLock();
        deadLock.perform();
    }
}