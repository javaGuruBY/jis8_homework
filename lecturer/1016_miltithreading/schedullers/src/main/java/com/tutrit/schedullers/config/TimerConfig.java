package com.tutrit.schedullers.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutrit.schedullers.job.TenCityTask;
import com.tutrit.schedullers.service.PersonService;
import com.tutrit.schedullers.timer.TimerWrapper;
import java.util.Timer;
import java.util.TimerTask;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class TimerConfig {

    @Value("${job.ten-city-job:false}")
    Boolean tenCityJob;
    @Autowired
    PersonService personService;
    @Autowired
    TimerWrapper timerWrapper;

    @Bean
    public Timer timer() {
        Timer timer = new Timer("Tenerife");
        if(tenCityJob) {
            timer.schedule(new TenCityTask(), 1, 1);
        }

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                personService.getPersons();
            }
        }, 1, 1);

        timer.schedule(timerWrapper.asTask(() -> log.error("as Task")), 1, 1);

        return timer;
    }
}
