package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.repository.MockShoppingCartRepository;
import github.kaydunovdenis.service.validator.ProductValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductTest.getTestProduct;

public class ShoppingCartServiceTest {
    private MockShoppingCartRepository repository;
    private ShoppingCartService shoppingCartService;
    private ShoppingCart shoppingCart;
    private Product product;

    @Before
    public void setUp() {
        repository = new MockShoppingCartRepository();
        shoppingCartService = new ShoppingCartService(new ProductService(), new ProductValidator());
        shoppingCart = new ShoppingCart("Cart#1");
        product = getTestProduct();
    }

    @Test
    public void addProduct() {
        Assert.assertEquals(0, shoppingCart.getProductList().size());
        shoppingCartService.addProduct(shoppingCart, product);
        Assert.assertEquals(1, shoppingCart.getProductList().size());
        Assert.assertTrue(shoppingCart.getProductList().contains(product));
    }

    @Test
    public void totalPriceSholdBeZeroOnStart() {
        BigDecimal actual = shoppingCartService.calculateTotalPriceShoppingCart(shoppingCart);
        Assert.assertEquals(0, BigDecimal.ZERO.compareTo(actual));
    }

    @Test
    public void calculateTotalPrice() {
        BigDecimal price = new BigDecimal("100.00");
        product.setPrice(price);
        product.setDiscount(new BigDecimal("0.00"));

        shoppingCartService.addProduct(shoppingCart, product);
        BigDecimal actual = shoppingCartService.calculateTotalPriceShoppingCart(shoppingCart);
        Assert.assertEquals(0, price.compareTo(actual));
    }

    @Test
    public void addShoppingCart() {
        repository.add(shoppingCart);
        Assert.assertTrue(repository.getRepository().containsKey(shoppingCart.getName()));
    }


}