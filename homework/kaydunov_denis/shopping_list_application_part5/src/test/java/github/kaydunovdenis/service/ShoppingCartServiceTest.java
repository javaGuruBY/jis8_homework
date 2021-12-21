package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.repository.MockShoppingCartRepository;
import github.kaydunovdenis.service.validator.ProductValidatorService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.TestProductProvider.getTestProduct;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartServiceTest {
    private MockShoppingCartRepository repository;
    private ShoppingCartService shoppingCartService;
    private ShoppingCart shoppingCart;
    private Product product;
    @Autowired
    private ProductValidatorService productValidatorService;

    @Before
    public void setUp() {
        repository = new MockShoppingCartRepository();
        shoppingCartService = new ShoppingCartService(new ProductService(), productValidatorService);
        shoppingCart = new ShoppingCart("Cart#1");
        product = getTestProduct();
    }

    @Test
    public void addProduct() {
        assertEquals(0, shoppingCart.getProductList().size());
        shoppingCartService.addProduct(shoppingCart, product);
        assertEquals(1, shoppingCart.getProductList().size());
        assertTrue(shoppingCart.getProductList().contains(product));
    }

    @Test
    public void totalPriceShouldBeZeroOnStart() {
        BigDecimal actual = shoppingCartService.calculateTotalPriceShoppingCart(shoppingCart);
        assertEquals(0, BigDecimal.ZERO.compareTo(actual));
    }

    @Test
    public void calculateTotalPrice() {
        BigDecimal price = new BigDecimal("100.00");
        product.setPrice(price);
        product.setDiscount(new BigDecimal("0.00"));

        shoppingCartService.addProduct(shoppingCart, product);
        BigDecimal actual = shoppingCartService.calculateTotalPriceShoppingCart(shoppingCart);
        assertEquals(0, price.compareTo(actual));
    }

    @Test
    public void addShoppingCart() {
        repository.add(shoppingCart);
        assertTrue(repository.getRepository().containsKey(shoppingCart.getName()));
    }
}