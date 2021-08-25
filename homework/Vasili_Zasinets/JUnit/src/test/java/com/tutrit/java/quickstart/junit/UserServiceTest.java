package com.tutrit.java.quickstart.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        var userTest = User.builder().age(2).id(123456789).name("Bakke").build();
        when(mockRepository.save(userTest)).thenReturn(methodForReturn());
        userService.addUser(userTest);
        //  doNothing().when(mockRepository.save(user));
        verify(mockRepository).save(userTest);
        var actual = methodForReturn().get(8);
        // assertEquals(userTest, actual);
    }

    private Map<Integer, User> methodForReturn() {
        Map<Integer, User> userMockRepository = new HashMap<>();
        var user = User.builder().age(33).name("Vasili").id(8).build();
        userMockRepository.put(8, user);
        return userMockRepository;
    }

    @Test(expected = UserValidationException.class)
    public void addUserExceptionIdTest() throws UserValidationException {
        var userTest = User.builder().age(33).name("Vasili").id(0).build();
        userService.addUser(userTest);
    }

    @Test(expected = UserValidationException.class)
    public void addUserExceptionTest() throws UserValidationException {
        userService.addUser(null);
    }
}
