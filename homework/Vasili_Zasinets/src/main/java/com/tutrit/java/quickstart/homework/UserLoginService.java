package com.tutrit.java.quickstart.homework;

public class UserLoginService {

    public void decreaseLoginAttempts(User user) {
        user.setNumberOfAttempts(user.getNumberOfAttempts() - 1);
    }

    public boolean restorationOfLoginAttempts(User user, String password) {
        if (user.getPassword().equals(password)) {
            user.setNumberOfAttempts(3);
            return true;
        } else {
            decreaseLoginAttempts(user);
            return false;
        }
    }

   public boolean login(User user, String password) {
        if (user.getNumberOfAttempts() == 0) {
            user.setBloc(true);
            return false;
        }
        if (user.isBlock()) {
            return false;
        }
       return restorationOfLoginAttempts(user, password);
    }
}

