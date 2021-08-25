package com.tutrit.java.quickstart.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

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
    public void addUserTest() throws UserValidationException {
        var userTest = User.builder().age(2).id(1234).name("Bakke").build();
        userService.addUser(userTest);
        verify(mockRepository).save(userTest);
    }

    @Test(expected = UserValidationException.class)
    public void addUserExceptionIdTest() throws UserValidationException {
        var userTest = User.builder().age(33).name("Vasili").id(0).build();
        userService.addUser(userTest);
    }

    @Test(expected = UserValidationException.class)
    public void addUserExceptionNotNullTest() throws UserValidationException {
        userService.addUser(null);
    }
}
