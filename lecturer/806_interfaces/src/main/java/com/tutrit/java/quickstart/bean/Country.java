package com.tutrit.java.quickstart.bean;

public class Country {
    City city;

    public Country(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
