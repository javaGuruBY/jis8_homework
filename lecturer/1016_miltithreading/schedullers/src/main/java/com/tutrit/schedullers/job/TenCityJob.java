package com.tutrit.schedullers.job;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TenCityJob implements Runnable{
    List<String> cities = List.of("Batumi", "Tbilisi", "Kutaisi", "Ureki", "Sarpi", "Minsk");

    @Override
    public void run() {
        int i = 10;
        while (i != 0) {
            log.info(nextCity());
            pause(1000);
            i--;
        }
    }

    private String nextCity() {
        int i = ThreadLocalRandom.current().nextInt(0, cities.size());
        return cities.get(i);
    }

    private void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
