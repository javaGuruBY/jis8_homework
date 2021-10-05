package github.kaydunovdenis;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.service.ProductService;
import github.kaydunovdenis.service.ShoppingCartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Denis Kaydunov
 */
public class ShoppingListApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ShoppingCartService shoppingCartService = new ShoppingCartService(new ProductService());
    }
}
