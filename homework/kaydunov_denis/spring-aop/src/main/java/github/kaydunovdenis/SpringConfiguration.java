package github.kaydunovdenis;

import github.kaydunovdenis.aspects.Logging;
import github.kaydunovdenis.service.HumanService;
import github.kaydunovdenis.service.UserServiceI;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Data
public class SpringConfiguration {

    private ApplicationContext ctx;
    private UserServiceI userService;
    private HumanService humanService;
    private Logging logging;

    public void init(ApplicationContext applicationContext) {
        ctx = applicationContext;
        userService = ctx.getBean("UserService", UserServiceI.class);
        humanService = ctx.getBean("HumanService", HumanService.class);
        logging = ctx.getBean("Log", Logging.class);
    }
}
