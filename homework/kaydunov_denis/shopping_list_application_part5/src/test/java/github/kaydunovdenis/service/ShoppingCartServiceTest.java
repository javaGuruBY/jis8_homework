package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import github.kaydunovdenis.repository.MockShoppingCartRepository;
import github.kaydunovdenis.service.validator.ProductValidatorService;
import github.kaydunovdenis.service.validator.Validity;
import github.kaydunovdenis.service.validator.impls.DiscountValidator;
import github.kaydunovdenis.service.validator.impls.NullProductValidator;
import github.kaydunovdenis.service.validator.impls.PriceValidator;
import github.kaydunovdenis.service.validator.impls.ProductNameValidator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static github.kaydunovdenis.bean.product.TestProductProvider.getTestProduct;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartServiceTest {
    private MockShoppingCartRepository repository;
    private ShoppingCartService shoppingCartService;
    private ShoppingCart shoppingCart;
    private Product product;


    @Before
    public void setUp() {
        repository = new MockShoppingCartRepository();

        //TODO вот так вот создавать валидаторы? это так не должно быть!
        final DiscountValidator discountValidator = new DiscountValidator();
        final NullProductValidator nullProductValidator = new NullProductValidator();
        final PriceValidator priceValidator = new PriceValidator();
        final ProductNameValidator productNameValidator = new ProductNameValidator();
        List<Validity> validityList = new ArrayList<>() {
            {
                add(discountValidator);
                add(nullProductValidator);
                add(priceValidator);
                add(productNameValidator);
            }
        };

        ProductValidatorService productValidatorService = new ProductValidatorService(validityList);
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