package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Person;
import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Functions {
    public static final Runnable printCurrentTime = () ->
            System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

    public static final Supplier<Person> defaultPerson = () -> new Person("max", 37);
    public static final Consumer<Person> printPerson = p -> System.out.println("person = " + p);
    public static final UnaryOperator<Person> makeItYoung = p -> {
        p.setAge(18);
        return p;
    };
    public static final UnaryOperator<Person> makeItYoungAgain = p -> p.setAgeAndReturn(16);
    public static final Predicate<Person> isHeYoung = person -> person.getAge() < 18;
    public static final Function<Integer, Person> makePersonWithAge = age -> new Person("default", age);
    public static final Function<String, Person> makePersonWithName = name -> new Person(name, 18);
    public static final BiFunction<Person, Integer, Person> addAge = (p, i) -> p.setAgeAndReturn(p.getAge() + i);
    public static final BiFunction<Person, Integer, Person> setAge = (p, i) -> p.setAgeAndReturn(i);
    public static final BiFunction<Person, String, Person> setName = (p, name) -> p.setNameAndReturn(name);

}










