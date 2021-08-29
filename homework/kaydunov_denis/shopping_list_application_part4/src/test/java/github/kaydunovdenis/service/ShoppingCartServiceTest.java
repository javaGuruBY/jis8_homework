package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductTest;
import github.kaydunovdenis.bean.ShoppingCart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ShoppingCartServiceTest {
    private ShoppingCartService shoppingCartService;
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        shoppingCartService = new ShoppingCartService();
        shoppingCart = new ShoppingCart("Cart#1");
    }

    @Test
    public void addProduct() {
        Product testProduct = ProductTest.getDefaultProduct();

        Assert.assertEquals(0, shoppingCart.getProductList().size());
        shoppingCartService.addProduct(shoppingCart, testProduct);
        Assert.assertEquals(1, shoppingCart.getProductList().size());
        Assert.assertTrue(shoppingCart.getProductList().contains(testProduct));
    }

    @Test
    public void calculateTotalPrice() {
        Product testProduct = ProductTest.getDefaultProduct();
        BigDecimal price = new BigDecimal("100.00");
        testProduct.setPrice(price);
        testProduct.setDiscount(new BigDecimal("0.00"));

        BigDecimal actual = shoppingCartService.calculateTotalPrice(shoppingCart);
        Assert.assertEquals(0, BigDecimal.ZERO.compareTo(actual));

        shoppingCartService.addProduct(shoppingCart, testProduct);
        actual = shoppingCartService.calculateTotalPrice(shoppingCart);
        Assert.assertEquals(0, price.compareTo(actual));
    }
}