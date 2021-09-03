package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Dog;
import org.junit.Assert;
import org.junit.Test;

import static com.tutrit.java.quickstart.Functions2.*;

public class Functions2Test {

    @Test
    public void makeDefaultDog() {
        Assert.assertEquals(new Dog("default", 1), defaultDog.get());
    }

    @Test
    public void printDog() {
        printDog.accept(defaultDog.get());
    }

    @Test
    public void dogWithName() {
        Dog dog = dogWithName.apply("Scratchy");
        Assert.assertEquals("Scratchy", dog.getName());
    }

    @Test
    public void makeDogOlder() {
        Dog dog = defaultDog.get();
        Assert.assertEquals(dog.setAge(2), makeDogOlder.apply(dog));
    }

    @Test
    public void isDogHaveName() {
        Dog dog = defaultDog.get();
        Assert.assertFalse(isDogHaveName.test(dog));

        dog = setName.apply(dog, "Scratchy");
        Assert.assertTrue(isDogHaveName.test(dog));
    }

    @Test
    public void addAge() {
        Dog dog = defaultDog.get();
        addAge.apply(dog, 4);
        Assert.assertEquals(5, dog.getAge());
    }

    @Test
    public void setAge() {
        Dog dog = defaultDog.get();
        setAge.apply(dog, 4);
        Assert.assertEquals(4, dog.getAge());
    }


}