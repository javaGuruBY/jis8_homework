package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.frameworks.AppRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class)
                .getBean(AppRunner.class)
                .main(args);
    }
}
