package com.tutrit.java.quickstart.service;

public interface Base {
    public static final String field = "";

    public static void doStuff() {
        System.out.println("interface body");
    }

    public abstract void undoStuff();
    public abstract void doMe();

    public default void defaultStuff() {
        System.out.println("default interface body");
    }

    public default void defaultConfusingStuff() {
        System.out.println("default interface body");
    }

    public default void veryComplicatedStuff() throws Exception {
        System.out.println("Not implemented");
        throw new Exception("Not implemented");
    }
}
