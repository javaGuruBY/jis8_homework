package com.tutrit.java.quickstart.bean;

public class House {

    Appartments appartments;

    public House(Appartments appartments) {
        this.appartments = appartments;
    }

    public Appartments getAppartments() {
        return appartments;
    }
}
