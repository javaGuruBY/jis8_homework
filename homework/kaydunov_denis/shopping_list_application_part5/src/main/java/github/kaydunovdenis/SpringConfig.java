package github.kaydunovdenis;

import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Denis Kaydunov
 */
@Configuration
@ComponentScan("github.kaydunovdenis")
@PropertySource("classpath:shoppingCart.properties")
public class SpringConfig {

    @Bean
    public ShoppingCart shoppingCart1() {
        return new ShoppingCart();
    }
}
