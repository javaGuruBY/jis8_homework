package com.tutrit.java.quickstart.jobs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Test;

public class ThreadPoolTest {

    @Test
    public void executors() throws InterruptedException {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        IntStream.range(0, 40).forEach(i -> fixedThreadPool.submit(new TenCity()));
        IntStream.range(0, 40).forEach(i -> singleThreadExecutor.submit(new TenCity()));

        Thread.sleep(1000000);
    }

    @Test
    public void scheduler() throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule(new TenCity(), 10, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new TenCity(), 0, 2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new TenCity(), 0, 2, TimeUnit.SECONDS);

        scheduledExecutorService.awaitTermination(60, TimeUnit.SECONDS);
    }

    @Test
    public void justBunchOfThreads() {
        IntStream.range(0, 40).forEach(i -> new Thread(new TenCity()).start());
    }

}
