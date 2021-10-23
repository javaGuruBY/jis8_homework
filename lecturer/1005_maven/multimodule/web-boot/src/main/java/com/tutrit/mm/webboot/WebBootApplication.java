package com.tutrit.mm.webboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"com.tutrit.mm.dao.gateway",
                "com.tutrit.mm.dao",
                "com.tutrit.mm.webboot"
})
public class WebBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(WebBootApplication.class, args);
        Arrays.stream(ctx.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
