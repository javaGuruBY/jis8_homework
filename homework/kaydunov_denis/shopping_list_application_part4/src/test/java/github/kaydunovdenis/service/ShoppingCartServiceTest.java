package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductTest.getDefaultProduct;

public class ShoppingCartServiceTest {
    private ShoppingCartService shoppingCartService;
    private ShoppingCart shoppingCart;
    private Product product;

    @Before
    public void setUp() {
        shoppingCartService = new ShoppingCartService();
        shoppingCart = new ShoppingCart("Cart#1");
        product = getDefaultProduct();
    }

    @Test
    public void addProduct() {
        Assert.assertEquals(0, shoppingCart.getProductList().size());
        shoppingCartService.addProduct(shoppingCart, product);
        Assert.assertEquals(1, shoppingCart.getProductList().size());
        Assert.assertTrue(shoppingCart.getProductList().contains(product));
    }

    @Test
    public void calculateTotalPrice() {
        BigDecimal price = new BigDecimal("100.00");
        product.setPrice(price);
        product.setDiscount(new BigDecimal("0.00"));

        BigDecimal actual = shoppingCartService.calculateTotalPrice(shoppingCart);
        Assert.assertEquals(0, BigDecimal.ZERO.compareTo(actual));

        shoppingCartService.addProduct(shoppingCart, product);
        actual = shoppingCartService.calculateTotalPrice(shoppingCart);
        Assert.assertEquals(0, price.compareTo(actual));
    }
}