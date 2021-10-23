package com.tutrit.java.quickstart.jobs;

import org.junit.Test;

public class ThreadsTest {

    @Test
    public void baseSyntax() throws InterruptedException {
        Thread cityStream = new CityStream();
        Thread countryStream = new Thread(new CountryStream(), "MikasDreamCountry");
        cityStream.start();
        countryStream.start();

//        cityStream.join();
//        countryStream.join();
        Thread.sleep(1000000);
    }

//    @Test
    public void states() throws InterruptedException {
        Thread cityStream = new CityStream();
        System.out.println("cityStream.getState() = " + cityStream.getState());
        cityStream.start();
        System.out.println("cityStream.getState() = " + cityStream.getState());
        cityStream.wait(550);
        System.out.println("cityStream.getState() = " + cityStream.getState());
        Thread.sleep(505);
        System.out.println("cityStream.getState() = " + cityStream.getState());
        cityStream.interrupt();
        System.out.println("cityStream.getState() = " + cityStream.getState());

    }
}
