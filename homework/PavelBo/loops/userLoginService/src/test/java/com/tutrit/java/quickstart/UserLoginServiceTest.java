package com.tutrit.java.quickstart;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {
    User user;
    UserLoginService userLoginService;

    @Before
    public void setUp() {
        user = new User("pavelBo", "1234");
        userLoginService = new UserLoginService(user);
    }

    @Test
    public void аttempts_loginTrue() {
       userLoginService.login(user, "1234");
       Assert.assertEquals(3, user.getАttempts());
    }

    @Test
    public void аttempts_loginFalse() {
        userLoginService.login(user, "1235");
        Assert.assertEquals(2, user.getАttempts());
    }

    @Test
    public void аttempts_loginFalseAfterTrue() {
        userLoginService.login(user, "1235");
        Assert.assertEquals(2, user.getАttempts());
        userLoginService.login(user, "1235");
        Assert.assertEquals(1, user.getАttempts());
        userLoginService.login(user, "1234");
        Assert.assertEquals(3, user.getАttempts());
    }

    @Test
    public void аttempts_login3False() {
        userLoginService.login(user, "1235");
        userLoginService.login(user, "1235");
        userLoginService.login(user, "1235");
        Assert.assertEquals(0, user.getАttempts());
    }

    @Test
    public void userBlocked() {
        userLoginService.login(user, "1235");
        Assert.assertEquals(false, user.isBLOCKED());
        userLoginService.login(user, "1235");
        Assert.assertEquals(false, user.isBLOCKED());
        userLoginService.login(user, "1235");
        Assert.assertEquals(true, user.isBLOCKED());
    }

    @Test
    public void userUnlocked(){
        userLoginService.login(user, "1235");
        Assert.assertEquals(false, user.isBLOCKED());
        userLoginService.login(user, "1235");
        Assert.assertEquals(false, user.isBLOCKED());
        userLoginService.login(user, "1235");
        Assert.assertEquals(true, user.isBLOCKED());
        userLoginService.login(user, "1234");
        Assert.assertEquals(true, user.isBLOCKED());
    }

}