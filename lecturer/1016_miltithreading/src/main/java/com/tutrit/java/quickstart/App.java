package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.jobs.CityStream;
import com.tutrit.java.quickstart.jobs.CountryStream;

public class App {

    public static void main(String[] args) {
        Thread cityStream = new CityStream();
        Thread countryStream = new Thread(new CountryStream(), "MikasDreamCountry");
        cityStream.start();
        countryStream.start();
    }
}

