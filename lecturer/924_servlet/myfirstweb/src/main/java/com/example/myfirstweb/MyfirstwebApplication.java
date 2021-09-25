package com.example.myfirstweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class MyfirstwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebApplication.class, args);
	}

}
