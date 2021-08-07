package com.tutrit.java.quickstart.service;

import org.junit.Before;
import org.junit.Test;

public class PrintingServiceTest {

    PrintingService printingService;

    @Before
    public void setUp() {
        printingService = new PrintingService();
    }

    @Test
    public void testTestRun() throws InterruptedException {
        new Thread(printingService).start();
        Thread.sleep(5000);
        PrintingService.doTheJob = false;
    }
}