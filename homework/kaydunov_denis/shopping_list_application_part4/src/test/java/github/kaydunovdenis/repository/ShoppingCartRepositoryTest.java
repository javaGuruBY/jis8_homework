package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.ShoppingCart;
import github.kaydunovdenis.service.ShoppingCartService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class ShoppingCartRepositoryTest {
    private ShoppingCartRepository shoppingCartRepository;
    private ShoppingCart shoppingCart1;


    @Before
    public void setUp() {
        shoppingCartRepository = new ShoppingCartRepository();
        shoppingCart1 = new ShoppingCart("Cart#1");
    }

    @Test
    public void getShoppingCarts() {
        Map<String, ShoppingCart> shoppingCarts = shoppingCartRepository.getShoppingCarts();
        Assert.assertNotNull(shoppingCarts);
        Assert.assertEquals(0, shoppingCartRepository.getShoppingCarts().size());

        shoppingCartRepository.saveShoppingCart(shoppingCart1);
        Assert.assertEquals(1, shoppingCartRepository.getShoppingCarts().size());
    }

    @Test
    public void removeShoppingCart() {
        saveShoppingCart();
        Assert.assertEquals(1, shoppingCartRepository.getShoppingCarts().size());
        shoppingCartRepository.removeShoppingCart(shoppingCart1);
        Assert.assertEquals(0, shoppingCartRepository.getShoppingCarts().size());
    }

    @Test
    public void getShoppingCartByName() {
        shoppingCartRepository.saveShoppingCart(shoppingCart1);
        ShoppingCart result = shoppingCartRepository.getShoppingCartByName("Cart#1");
        Assert.assertEquals(shoppingCart1, result);
    }

    @Test
    public void saveShoppingCart() {
        shoppingCartRepository.saveShoppingCart(shoppingCart1);
        Assert.assertEquals(1, shoppingCartRepository.getShoppingCarts().size());
    }
}
