package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class ShoppingCartRepositoryTest {
    private ShoppingCartRepositoryHashMapImpl shoppingCartRepository;
    private ShoppingCart testShoppingCart;


    @Before
    public void setUp() {
        shoppingCartRepository = new ShoppingCartRepositoryHashMapImpl();
        testShoppingCart = new ShoppingCart("Cart#1");
    }

    @Test
    public void repositoryShouldBeInitializedOnStart() {
        Assert.assertNotNull(shoppingCartRepository.getRepository());
    }


    @Test
    public void getShoppingCarts() {
        Assert.assertTrue(shoppingCartRepository.getRepository() instanceof HashMap);
    }

    @Test
    public void removeShoppingCart() {
        saveShoppingCart();
        Assert.assertEquals(1, shoppingCartRepository.getRepository().size());
        shoppingCartRepository.removeShoppingCart(testShoppingCart);
        Assert.assertEquals(0, shoppingCartRepository.getRepository().size());
    }

    @Test
    public void getShoppingCartByName() {
        shoppingCartRepository.saveShoppingCart(testShoppingCart);
        var result = shoppingCartRepository.getShoppingCartByName("Cart#1");
        Assert.assertEquals(testShoppingCart, result);
    }

    @Test
    public void saveShoppingCart() {
        shoppingCartRepository.saveShoppingCart(testShoppingCart);
        Assert.assertEquals(1, shoppingCartRepository.getRepository().size());
    }
}
