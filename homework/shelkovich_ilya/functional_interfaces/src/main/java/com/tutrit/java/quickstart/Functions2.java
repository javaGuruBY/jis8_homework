package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.*;

public class Functions2 {

    static Logger log = LoggerFactory.getLogger(Functions2.class);

    public static final Supplier<Dog> defaultDog = () -> new Dog("default", 1);
    public static final Consumer<Dog> printDog = dog -> log.info("{}", dog);
    public static final Function<String, Dog> dogWithName = name -> new Dog(name, 1);
    public static final UnaryOperator<Dog> makeDogOlder = dog -> dog.setAge(2);
    public static final Predicate<Dog> isDogHaveName = dog -> !dog.getName().equals("default");
    public static final BiFunction<Dog, Integer, Dog> addAge = (d, i) -> d.setAge(d.getAge() + i);
    public static final BiFunction<Dog, Integer, Dog> setAge = Dog::setAge;
    public static final BiFunction<Dog, String, Dog> setName = Dog::setName;
}
