package github.kaydunovdenis;

import github.kaydunovdenis.aspects.Logging;
import github.kaydunovdenis.service.HumanService;
import github.kaydunovdenis.service.UserServiceI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServiceI userService = (UserServiceI) ctx.getBean("UserService");
        HumanService humanService = (HumanService) ctx.getBean("HumanService");
        Logging logging = (Logging) ctx.getBean("Log");

        userService.createUser();
        userService.updateUser();
        try {
            userService.riskyOperationOnUser();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        userService.simpleOperationOnUser("userName", "userNic");
    }
}