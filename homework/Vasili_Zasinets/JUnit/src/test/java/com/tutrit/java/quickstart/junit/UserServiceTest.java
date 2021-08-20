package com.tutrit.java.quickstart.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

   private Map<Integer, User> userMockRepository;
   private User user;

    @Mock
    private UserRepository mock;

    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        this.user = new User(1256, "Bakke", 2);
        this.userMockRepository = new HashMap<>();
    }

    @Test
    public void addUserTest() throws UserValidationException {
        when(mock.save(user)).thenReturn(methodForReturn());
        userService.addUser(user);
        var actual = userMockRepository.get(1256);
        assertEquals(user, actual);
    }

    private Map<Integer, User> methodForReturn() {
        userMockRepository.put(1256, user);
        return userMockRepository;
    }
}
