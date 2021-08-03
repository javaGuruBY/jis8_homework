package com.tutrit.java.quickstart.bean;

public abstract class Human {
    private String name = "maxim";
    private String nick = "@info";

    protected Human() {

    }

    protected Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    private void killYourself() {
        System.out.println(name + "has been step out the window");
    }

    protected void getOut() {
        killYourself();
    }
}
