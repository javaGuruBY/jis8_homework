package com.tutrit.java.quickstart.bean.bean.thread.deadLock;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeadLockAvoidingTh3dTest {

    @Test
    public void perform() {
        var deadLock = new DeadLockAvoidingTh3d();
        deadLock.perform();
    }
}