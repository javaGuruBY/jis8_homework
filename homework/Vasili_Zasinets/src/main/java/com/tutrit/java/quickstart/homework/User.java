package com.tutrit.java.quickstart.homework;

public class User {

    boolean bloc = false;
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

    public boolean isBloc() {
        return bloc;
    }

    public boolean setBloc(boolean bloc) {
        this.bloc = bloc;
        return bloc;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }


}
