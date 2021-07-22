package com.tutrit.java.quickstart;

import java.util.Objects;

public class User {

    private String login;
    private String password;
    private boolean BLOCKED;

    private int аttempts = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBLOCKED() {
        return BLOCKED;
    }

    public void setBLOCKED(boolean BLOCKED) {
        this.BLOCKED = BLOCKED;
    }

    public int getАttempts() {
        return аttempts;
    }

    public void setАttempts(int аttempts) {
        this.аttempts = аttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }

    public void resetAttempts () {
        аttempts = 3;
    }
}
