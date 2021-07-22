package com.tutrit.java.quickstart;

public class UserLoginService {

    User user;

    public UserLoginService(User user){
        this.user = user;
    }

    public boolean login(User user, String password) {
        if (user.isBLOCKED()){
            return false;
        }else {
            if (isPassword(user, password)){
                user.resetAttempts();
                return true;
            }else {
                user.setАttempts(user.getАttempts() - 1);
                blockedUser(user);
                return false;
            }
        }
    }

    private void blockedUser(User user) {
        if (user.getАttempts() == 0){
            user.setBLOCKED(true);
        }
    }

    private boolean isPassword(User user, String password) {
        return user.getPassword().equals(password);
    }

}
