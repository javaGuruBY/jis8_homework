package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.TestProductProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductServiceTest {
    private Product product;

    @Before
    public void setUp() {
        product = TestProductProvider.getTestProduct();
    }

    @Test
    public void getPercentageDiscount() {
        //TODO replace on parameterized tests
        var expect = TestProductProvider.DEFAULT_PERCENTAGE_DISCOUNT;
        var result = ProductService.getPercentageDiscount(product);
        assertEquals(expect, result);

        product.setDiscount(new BigDecimal("0.1234"));
        expect = "12,34%";
        result = ProductService.getPercentageDiscount(product);
        assertEquals(expect, result);

        product.setDiscount(new BigDecimal("0.99349"));
        expect = "99,35%";
        result = ProductService.getPercentageDiscount(product);
        assertEquals(expect, result);

        product.setDiscount(new BigDecimal("1"));
        expect = "100,00%";
        result = ProductService.getPercentageDiscount(product);
        assertEquals(expect, result);
    }

    @Test(expected = NumberFormatException.class)
    public void whenDiscountOver100_shouldReturnNoMoreThan100() {
        product.setDiscount(new BigDecimal("1,12"));
        ProductService.getPercentageDiscount(product);
    }


    @Test
    public void getPriceWithDiscount() {
        var productService = new ProductService();
        var product = TestProductProvider.getTestProduct();
        product.setPrice(new BigDecimal("100"));
        product.setDiscount(new BigDecimal("20"));
        var actual = productService.getPriceWithDiscount(product);
        assertEquals(new BigDecimal("80.00"), actual);
    }
}
