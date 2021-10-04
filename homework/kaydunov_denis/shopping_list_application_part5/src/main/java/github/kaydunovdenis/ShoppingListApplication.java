package github.kaydunovdenis;

import github.kaydunovdenis.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Denis Kaydunov
 */
@Slf4j
public class ShoppingListApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ShoppingCartService shoppingCartService = context.getBean(ShoppingCartService.class);
        log.info(shoppingCartService.toString());
    }
}
