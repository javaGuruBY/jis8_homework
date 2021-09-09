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

    public static final Runnable PRINT_CURRENT_TIME = () -> log.info("{}", LocalDateTime.now());

    public static final Supplier<Person> DEFAULT_PERSON = () -> new Person("default", 18);
    public static final Consumer<Person> PRINT_PERSON = person -> log.info("{}", person);
    public static final Function<String, Person> CREATE_PERSON_WITH_NAME = name -> new Person(name, 18);
    public static final IntFunction<Person> CREATE_PERSON_WITH_AGE = age -> new Person("default", age);
    public static final UnaryOperator<Person> MAKE_PERSON_BRUTALLY_OLDER = person -> person.setAge(99);
    public static final Predicate<Person> IS_PERSON_OLD = person -> person.getAge() > 19;
    public static final BiFunction<Person, Integer, Person> ADD_AGE = (p, i) -> p.setAge(p.getAge() + i);
    public static final BiFunction<Person, Integer, Person> SET_AGE = Person::setAge;
    public static final BiFunction<Person, String, Person> SET_NAME = Person::setName;
}
