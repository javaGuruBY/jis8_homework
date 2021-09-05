package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Person;
import org.junit.Assert;
import org.junit.Test;

import static com.tutrit.java.quickstart.Functions.*;

public class FunctionsTest {

    @Test
    public void printTime() {
        PRINT_CURRENT_TIME.run();
    }

    @Test
    public void createDefaultPerson() {
        Assert.assertEquals(new Person("default", 18), DEFAULT_PERSON.get());
    }

    @Test
    public void printPerson() {
        PRINT_PERSON.accept(DEFAULT_PERSON.get());
    }

    @Test
    public void createPersonWith() {
        Person person1 = CREATE_PERSON_WITH_NAME.apply("Mark");
        Assert.assertEquals("Mark", person1.getName());

        Person person2 = CREATE_PERSON_WITH_AGE.apply(49);
        Assert.assertEquals(49, person2.getAge());
    }

    @Test
    public void makePersonOlder() {
        Person person = DEFAULT_PERSON.get();
        Assert.assertEquals(person.setAge(99), MAKE_PERSON_BRUTALLY_OLDER.apply(person));
    }

    @Test
    public void isPersonOld() {
        Person person = CREATE_PERSON_WITH_AGE.apply(15);
        Assert.assertFalse(IS_PERSON_OLD.test(person));
        person = MAKE_PERSON_BRUTALLY_OLDER.apply(person);
        Assert.assertTrue(IS_PERSON_OLD.test(person));
    }

    @Test
    public void addAge() {
        Person person = DEFAULT_PERSON.get();
        ADD_AGE.apply(person, 30);
        Assert.assertEquals(48, person.getAge());
    }

    @Test
    public void setAge() {
        Person person = DEFAULT_PERSON.get();
        SET_AGE.apply(person, 45);
        Assert.assertEquals(45, person.getAge());
    }

    @Test
    public void setName() {
        Person person = DEFAULT_PERSON.get();
        SET_NAME.apply(person, "Mark");
        Assert.assertEquals("Mark", person.getName());
    }
}
