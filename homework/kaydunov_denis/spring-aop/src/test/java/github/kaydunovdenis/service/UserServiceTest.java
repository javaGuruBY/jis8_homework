package github.kaydunovdenis.service;

import github.kaydunovdenis.SpringConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceTest {
    private static UserServiceI userService;

    @BeforeAll
    static void setUp() {
        SpringConfiguration config = new SpringConfiguration();
        config.init(new ClassPathXmlApplicationContext("spring-config.xml"));
        userService = config.getUserService();
    }

    @Test
    void createUser() {
        userService.createUser();
    }

    @Test
    void updateUser() {
        userService.updateUser();
    }

    @Test
    void riskyOperationOnUser() {
        try {
            userService.riskyOperationOnUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void simpleOperationOnUser() {
        userService.simpleOperationOnUser("userName", "userNic");
    }
}