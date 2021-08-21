package com.tutrit.java.quickstart.homework;

public class UserLoginService {

    private void decreaseLoginAttempts(User user) {
        user.setNumberOfAttempts(user.getNumberOfAttempts() - 1);
        if (user.getNumberOfAttempts() == 0) {
            user.setBloc(true);
        }
    }

    private boolean restorationOfLoginAttempts(User user, String password) {
        if (user.getPassword().equals(password)) {
            user.setNumberOfAttempts(3);
            return true;
        } else {
            decreaseLoginAttempts(user);
            return false;
        }
    }

    public boolean login(User user, String password) {
        if (user.isBlock()) {
            return false;
        }
        return restorationOfLoginAttempts(user, password);
    }
}
