package com.tutrit.java.quickstart.jobs;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountryStream implements Runnable {

    List<String> countries = List.of("Poland", "Georgia", "Belarus", "Spain", "France");

    @Override
    public void run() {
        while (true) {
            log.info(nextCity());
            pause(1000);
        }
    }

    private String nextCity() {
        int i = ThreadLocalRandom.current().nextInt(0, countries.size());
        return countries.get(i);
    }


    private void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
