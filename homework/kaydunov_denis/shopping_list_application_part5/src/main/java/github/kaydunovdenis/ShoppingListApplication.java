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
        final var shoppingCart = context.getBean(ShoppingCart.class);
        System.out.println(shoppingCart.getName());

        ShoppingCartService shoppingCartService = new ShoppingCartService(new ProductService());

        ShoppingCart shoppingCart1 = new ShoppingCart("Shopping cart of Denis");
        ShoppingCart shoppingCart2 = new ShoppingCart("Shopping cart of Max");

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();

        shoppingCartService.addProduct(shoppingCart1, product1);
        shoppingCartService.addProduct(shoppingCart1, product2);

        shoppingCartService.addProduct(shoppingCart2, product1);
        shoppingCartService.addProduct(shoppingCart2, product3);
        shoppingCartService.addProduct(shoppingCart2, product4);
    }
}
