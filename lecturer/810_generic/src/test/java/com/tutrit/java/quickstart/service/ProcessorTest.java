package com.tutrit.java.quickstart.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcessorTest {

    @Test
    public void run() {
        new Processor<>().run();
    }

}