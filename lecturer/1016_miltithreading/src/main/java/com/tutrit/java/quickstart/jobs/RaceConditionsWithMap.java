package com.tutrit.java.quickstart.jobs;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RaceConditionsWithMap {

    public static Map<String, Integer> counters = new ConcurrentHashMap<>();

    public void demo() throws InterruptedException {

        Thread left = new Thread(() ->
            IntStream.range(0, 1_000).forEach(i -> {
                counters.put("Batumi", i);
                pause(1);
            }));

        Thread right = new Thread(() ->
            IntStream.range(0, 1_000).forEach(i ->  {
                counters.put("Batumi", i);
                pause(1);
            }));

        left.start();
        right.start();

        left.join();
        right.join();
    }

    private static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
