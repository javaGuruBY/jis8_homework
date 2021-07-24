package com.tutrit.java.quickstart.homework;

public class User {

    boolean isBlock = false;
    int entry = 3;
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public boolean setBloc(boolean bloc) {
        this.isBlock = bloc;
        return bloc;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }


}
