package com.tutrit.java.quickstart;

import static com.tutrit.java.quickstart.Functions.addAge;
import static com.tutrit.java.quickstart.Functions.defaultPerson;
import static com.tutrit.java.quickstart.Functions.isHeYoung;
import static com.tutrit.java.quickstart.Functions.makeItYoung;
import static com.tutrit.java.quickstart.Functions.makeItYoungAgain;
import static com.tutrit.java.quickstart.Functions.makePersonWithAge;
import static com.tutrit.java.quickstart.Functions.makePersonWithName;
import static com.tutrit.java.quickstart.Functions.printCurrentTime;
import static com.tutrit.java.quickstart.Functions.printPerson;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.tutrit.java.quickstart.bean.Person;
import org.junit.Test;

public class FunctionsTest {

    @Test
    public void printCurrentTime() {
        printCurrentTime.run();
    }

    @Test
    public void defaultPerson() {
        Person result = defaultPerson.get();
        System.out.println("result = " + result);
    }

    @Test
    public void printPerson() {
        Person person = defaultPerson.get();
        printPerson.accept(person);
    }

    @Test
    public void makeYoung() {
        Person person = defaultPerson.get();
        printPerson.accept(person);
        makeItYoung.apply(person);
        printPerson.accept(person);
        makeItYoungAgain.apply(person);
        printPerson.accept(person);
    }

    @Test
    public void makeYoungAgain() {
        Person person = defaultPerson.get();
        makeItYoung.andThen(makeItYoungAgain).apply(person);
        System.out.println("\n");
        Person p = defaultPerson.get();
        makeItYoungAgain.andThen(makeItYoung).apply(p);
    }

    @Test
    public void isHeYoung() {
        Person person = defaultPerson.get();
        assertFalse(isHeYoung.test(person));
        person = makeItYoungAgain.apply(person);
        assertTrue(isHeYoung.test(person));
    }

    @Test
    public void makePersonWith() {
        Person person1 = makePersonWithAge.apply(27);
        Person person2 = makePersonWithName.apply("Kurt");

        assertEquals(27, person1.getAge());
        assertEquals("Kurt", person2.getName());
    }

    @Test
    public void addAge() {
        Person person = makePersonWithAge.apply(27);
        addAge.apply(person, 10);
        assertEquals(37, person.getAge());
    }
}
