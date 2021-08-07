package com.tutrit.java.quickstart.service;

public interface Confusing {
    public static final String field = "Confusing field";
    public default void defaultConfusingStuff() {

        System.out.println("Confusing default interface body");
    }
}
