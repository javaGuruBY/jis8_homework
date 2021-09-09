package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.*;

public class Functions2 {

    private Functions2() {

    }

    static Logger log = LoggerFactory.getLogger(Functions2.class);

    public static final Supplier<Dog> DEFAULT_DOG = () -> new Dog("default", 1);
    public static final Consumer<Dog> PRINT_DOG = dog -> log.info("{}", dog);
    public static final Function<String, Dog> DOG_WITH_NAME = name -> new Dog(name, 1);
    public static final UnaryOperator<Dog> MAKE_DOG_OLDER = dog -> dog.setAge(2);
    public static final Predicate<Dog> IS_DOG_HAVE_NAME = dog -> !dog.getName().equals("default");
    public static final BiFunction<Dog, Integer, Dog> ADD_AGE = (d, i) -> d.setAge(d.getAge() + i);
    public static final BiFunction<Dog, Integer, Dog> SET_AGE = Dog::setAge;
    public static final BiFunction<Dog, String, Dog> SET_NAME = Dog::setName;
}
