package com.tutrit.java.quickstart.bean.bean.thread;

import com.tutrit.java.quickstart.bean.bean.thread.deadLock.DeadLock;

public class App {


    public static void main(String[] args) {
        var deadLock = new DeadLock();
        deadLock.perform();
    }
}

