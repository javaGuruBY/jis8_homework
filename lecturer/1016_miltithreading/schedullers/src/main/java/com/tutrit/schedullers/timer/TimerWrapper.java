package com.tutrit.schedullers.timer;

import java.util.TimerTask;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

@Component
public class TimerWrapper {

    public TimerTask asTask(Runnable runnable) {
        return new TimerTask() {
            @Override
            public void run() {
                runnable.run();
            }
        };
    }
}
