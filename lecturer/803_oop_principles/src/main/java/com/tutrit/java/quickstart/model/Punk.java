package com.tutrit.java.quickstart.model;

import com.tutrit.java.quickstart.bean.Human;

public class Punk extends Human {
    private String nick = "PUNK";

    public Punk(String name) {
        super(name);
    }

    public Punk() {
        System.out.println("getNick() = " + getNick());
    }

    public String getNick() {
        return nick;
    }

    public void secretName() {
        System.out.println("getName() = " + getName());
    }

    void yesPunkGetOut() {
        getOut();
    }

    @Override
    public String toString() {
        return "Punk{"+super.toString()+"}" ;
    }

    public void toStringDemo() {
        System.out.println("super.toString() = " + super.toString());
        System.out.println("this.toString() = " + this.toString());
    }
}
