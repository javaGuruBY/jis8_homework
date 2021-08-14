package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Dog;
import com.tutrit.java.quickstart.service.DogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger("Application");

    public static void main(String[] args) {
        var bullDog = new Dog();
        var dogService = new DogService();

        bullDog.setAge(4);
        bullDog.setColor("red");
        bullDog.setName("Shrimp");

        log.info("Dog created: {}", bullDog);

        dogService.run();

    }
}

