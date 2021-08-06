package com.tutrit.java.quickstart.service;

import java.io.Serializable;

public class BaseImplementation extends BaseAbstract implements Confusing, Serializable {
    @Override
    public void doMe() {

    }

    @Override
    public void undoStuff() {

    }

    /* *
    *  default method should be implemented due to multiple versions in
    *  Base and Confusing interfaces
    * */
    @Override
    public void defaultConfusingStuff() {
        System.out.println(Base.field);
        System.out.println(Confusing.field);
    }
}
