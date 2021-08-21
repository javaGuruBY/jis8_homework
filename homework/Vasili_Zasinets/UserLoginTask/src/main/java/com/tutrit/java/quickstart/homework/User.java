package com.tutrit.java.quickstart.homework;

public class User {

    boolean isBlock;
    private int numberOfAttempts = 3;
    private  String login;
    private  String password;

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

    public String getLogin() {
        return login;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }
}
