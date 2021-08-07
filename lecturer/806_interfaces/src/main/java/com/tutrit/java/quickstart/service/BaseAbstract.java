package com.tutrit.java.quickstart.service;

public abstract class BaseAbstract implements Base {
    public static final String FIELD = "";

    public static void doStuff() {
        System.out.println("abstract body");
    }

    public abstract void undoStuff();

    public void defaultStuff() {
        System.out.println("default interface body");
    }
}
