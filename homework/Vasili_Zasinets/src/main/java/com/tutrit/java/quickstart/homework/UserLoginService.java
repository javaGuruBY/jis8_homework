package com.tutrit.java.quickstart.homework;

public class UserLoginService {

    boolean login(User user, String password) {
        if (user.getEntry() == 0) {
             user.setBloc(true);
             return  false;
        }
        if (user.isBloc()) return false;
        if (user.getPassword().equals(password)) {
            user.setEntry(3);
            return true;
        } else {
            user.setEntry(user.getEntry() - 1);
            return false;
        }
    }
}
