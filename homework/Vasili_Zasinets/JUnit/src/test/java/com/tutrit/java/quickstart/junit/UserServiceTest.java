package com.tutrit.java.quickstart.junit;

import com.tutrit.java.quickstart.junit.validation.CheckUserId;
import com.tutrit.java.quickstart.junit.validation.CheckUserNotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository mockRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService(mockRepository);
    }

    @Test
    public void addUserTest() {
        var userTest = User.builder().age(2).id(1234).name("Bakke").build();
        userService.addUser(userTest);
        verify(mockRepository).save(userTest);
    }

    @Test(expected = UserValidationException.class)
    public void userExceptionIdTest() throws UserValidationException {
        var userTest = User.builder().age(33).name("Vasili").id(0).build();
        var checkUser = new CheckUserId();
        checkUser.check(userTest);
    }

    @Test(expected = UserValidationException.class)
    public void userExceptionNotNullTest() throws UserValidationException {
        var checkUser = new CheckUserNotNull();
        checkUser.check(null);
    }

    @Test(expected = UserValidationException.class)
    public void addUserNullExceptionTest() {
        userService.addUser(null);
    }

    @Test(expected = UserValidationException.class)
    public void addUserIdExceptionTest() {
        var userTest = User.builder().age(2).id(0).name("Bakke").build();
        userService.addUser(userTest);
    }

    @Test
    public void userRepository() {
        var userTest = User.builder().age(2).id(22).name("Bakke").build();
        var userRepository = new UserRepository();
        userRepository.save(userTest);
        var actual = userRepository.getUsers().get(22);
        assertEquals(userTest, actual);
    }
}
