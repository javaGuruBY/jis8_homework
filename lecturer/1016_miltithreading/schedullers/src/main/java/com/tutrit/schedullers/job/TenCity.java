package com.tutrit.schedullers.job;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TenCity {
    List<String> cities = List.of("Batumi", "Tbilisi", "Kutaisi", "Ureki", "Sarpi", "Minsk");

    @Scheduled(fixedRate = 2, initialDelay = 1, timeUnit = TimeUnit.SECONDS)
//    @Scheduled(cron = "0 0 3 * * *")
    public void startJob() {
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
