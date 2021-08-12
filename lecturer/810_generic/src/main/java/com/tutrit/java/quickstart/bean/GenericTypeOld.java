package com.tutrit.java.quickstart.bean;

public class GenericTypeOld<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public void run(){
        GenericTypeOld<Integer> type = new GenericTypeOld();
        Integer str = type.get(); //type casting, error prone and can cause ClassCastException
    }
}
