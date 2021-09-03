package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Person;
import org.junit.Assert;
import org.junit.Test;

import static com.tutrit.java.quickstart.Functions.*;

public class FunctionsTest {

    @Test
    public void printTime() {
        printCurrentTime.run();
    }

    @Test
    public void createDefaultPerson() {
        Assert.assertEquals(new Person("default", 18), defaultPerson.get());
    }

    @Test
    public void printPerson() {
        printPerson.accept(defaultPerson.get());
    }

    @Test
    public void createPersonWith() {
        Person person1 = createPersonWithName.apply("Mark");
        Assert.assertEquals("Mark", person1.getName());

        Person person2 = createPersonWithAge.apply(49);
        Assert.assertEquals(49, person2.getAge());
    }

    @Test
    public void makePersonOlder() {
        Person person = defaultPerson.get();
        Assert.assertEquals(person.setAge(99), makePersonBrutallyOlder.apply(person));
    }

    @Test
    public void isPersonOld() {
        Person person = createPersonWithAge.apply(15);
        Assert.assertFalse(isPersonOld.test(person));
        person = makePersonBrutallyOlder.apply(person);
        Assert.assertTrue(isPersonOld.test(person));
    }

    @Test
    public void addAge() {
        Person person = defaultPerson.get();
        addAge.apply(person, 30);
        Assert.assertEquals(48, person.getAge());
    }

    @Test
    public void setAge() {
        Person person = defaultPerson.get();
        setAge.apply(person, 45);
        Assert.assertEquals(45, person.getAge());
    }

    @Test
    public void setName() {
        Person person = defaultPerson.get();
        setName.apply(person, "Mark");
        Assert.assertEquals("Mark", person.getName());
    }
}

