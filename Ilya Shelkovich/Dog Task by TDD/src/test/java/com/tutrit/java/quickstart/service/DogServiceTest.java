package com.tutrit.java.quickstart.service;

import static org.junit.Assert.*;

import com.tutrit.java.quickstart.bean.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogServiceTest {

    DogService dogService;
    Dog dog;
    String dogVoice;
    String dogEats;
    String dogSleeps;

    @Before
    public void setUp(){
        this.dogService = new DogService();
        this.dog = new Dog();
        this.dogVoice = "haau haau";
        this.dogEats = "Dog is eating";
        this.dogSleeps = "Dog is not sleeping";
    }

    @Test
    public void makeVoice(){
        String expected = "haau haau";
        String actual = dogService.makeVoice(dogVoice);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFood(){
        String expected = "Dog is eating";
        String actual = dogService.eatFood(dogEats);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void goSleep(){
        String expected = "Dog is no sleeping";
        String actual = dogService.goSleep(dogSleeps);
        Assert.assertEquals(expected, actual);
    }

}
