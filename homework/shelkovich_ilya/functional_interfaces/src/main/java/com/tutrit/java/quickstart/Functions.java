package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.function.*;

public class Functions {

    private Functions() {

    }

    static Logger log = LoggerFactory.getLogger(Functions.class);

    public static final Runnable printCurrentTime = () -> log.info("{}", LocalDateTime.now());

    public static final Supplier<Person> defaultPerson = () -> new Person("default", 18);
    public static final Consumer<Person> printPerson = person -> log.info("{}", person);
    public static final Function<String, Person> createPersonWithName = name -> new Person(name, 18);
    public static final IntFunction<Person> createPersonWithAge = age -> new Person("default", age);
    public static final UnaryOperator<Person> makePersonBrutallyOlder = person -> person.setAge(99);
    public static final Predicate<Person> isPersonOld = person -> person.getAge() > 19;
    public static final BiFunction<Person, Integer, Person> addAge = (p, i) -> p.setAge(p.getAge() + i);
    public static final BiFunction<Person, Integer, Person> setAge = Person::setAge;
    public static final BiFunction<Person, String, Person> setName = Person::setName;
}

