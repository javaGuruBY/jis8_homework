package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartRepositoryTest {
    private ShoppingCartRepository shoppingCartRepository;
    private ShoppingCart testShoppingCart;


    @Before
    public void setUp() {
        shoppingCartRepository = new ShoppingCartRepository();
        testShoppingCart = new ShoppingCart("Cart#1");
    }

    @Test
    public void getShoppingCarts() {
        var shoppingCarts = shoppingCartRepository.getShoppingCarts();
        Assert.assertNotNull(shoppingCarts);
        Assert.assertEquals(0, shoppingCartRepository.getShoppingCarts().size());

        shoppingCartRepository.saveShoppingCart(testShoppingCart);
        Assert.assertEquals(1, shoppingCartRepository.getShoppingCarts().size());
    }

    @Test
    public void removeShoppingCart() {
        saveShoppingCart();
        Assert.assertEquals(1, shoppingCartRepository.getShoppingCarts().size());
        shoppingCartRepository.removeShoppingCart(testShoppingCart);
        Assert.assertEquals(0, shoppingCartRepository.getShoppingCarts().size());
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
        Assert.assertEquals(1, shoppingCartRepository.getShoppingCarts().size());
    }
}
