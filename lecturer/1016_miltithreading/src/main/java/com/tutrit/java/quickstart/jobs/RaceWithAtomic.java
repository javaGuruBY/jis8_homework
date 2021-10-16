package com.tutrit.java.quickstart.jobs;

import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RaceWithAtomic {

    public static AtomicInteger counter = new AtomicInteger(0);

    public void demo() throws InterruptedException {

        Thread left = new Thread(() ->
            IntStream.range(0, 1_000_000).forEach(i -> counter.getAndIncrement()));

        Thread right = new Thread(() ->
            IntStream.range(0, 1_000_000).forEach(i ->  counter.getAndDecrement()));

        left.start();
        right.start();

        left.join();
        right.join();

        log.info("counter value = {}", counter);
    }
}
