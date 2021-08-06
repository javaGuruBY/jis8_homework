package com.tutrit.java.quickstart.bean;

public class Room {

    Closed closed;

    public Room(Closed closed) {
        this.closed = closed;
    }

    public Closed getClosed() {
        return closed;
    }
}
