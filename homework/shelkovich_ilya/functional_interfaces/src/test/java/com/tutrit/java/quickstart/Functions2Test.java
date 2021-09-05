package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Dog;
import org.junit.Assert;
import org.junit.Test;

import static com.tutrit.java.quickstart.Functions2.*;

public class Functions2Test {

    @Test
    public void makeDefaultDog() {
        Assert.assertEquals(new Dog("default", 1), DEFAULT_DOG.get());
    }

    @Test
    public void printDog() {
        PRINT_DOG.accept(DEFAULT_DOG.get());
    }

    @Test
    public void dogWithName() {
        Dog dog = DOG_WITH_NAME.apply("Scratchy");
        Assert.assertEquals("Scratchy", dog.getName());
    }

    @Test
    public void makeDogOlder() {
        Dog dog = DEFAULT_DOG.get();
        Assert.assertEquals(dog.setAge(2), MAKE_DOG_OLDER.apply(dog));
    }

    @Test
    public void isDogHaveName() {
        Dog dog = DEFAULT_DOG.get();
        Assert.assertFalse(IS_DOG_HAVE_NAME.test(dog));

        dog = SET_NAME.apply(dog, "Scratchy");
        Assert.assertTrue(IS_DOG_HAVE_NAME.test(dog));
    }

    @Test
    public void addAge() {
        Dog dog = DEFAULT_DOG.get();
        ADD_AGE.apply(dog, 4);
        Assert.assertEquals(5, dog.getAge());
    }

    @Test
    public void setAge() {
        Dog dog = DEFAULT_DOG.get();
        SET_AGE.apply(dog, 4);
        Assert.assertEquals(4, dog.getAge());
    }
}
