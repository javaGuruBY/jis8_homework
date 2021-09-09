package com.tutrit.java.javautil.bean;

import java.util.Observable;
import java.util.Observer;

public class Course extends Observable {

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
