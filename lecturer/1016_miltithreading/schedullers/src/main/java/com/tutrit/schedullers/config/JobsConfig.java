package com.tutrit.schedullers.config;

import com.tutrit.schedullers.job.TenCityJob;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobsConfig {

    @Value("${job.ten-city-job}")
    Boolean tenCityJob;
    @Autowired
    TenCityJob tenCityJobRunner;

    @Bean
    public ScheduledExecutorService scheduledExecutorService() {
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(5);
        if(tenCityJob) {
            executorService.scheduleWithFixedDelay(tenCityJobRunner, 1, 1, TimeUnit.SECONDS);
        }
        return executorService;
    }
}
