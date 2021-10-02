package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ProductServiceTest {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private Product product;

    @Before
    public void setUp() {
        product = ProductTest.getDefaultProduct();
    }

    @Test
    public void getPercentageDiscount() {
        var expect = ProductTest.DEFAULT_PERCENTAGE_DISCOUNT;
        var result = ProductService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);

        product.setDiscount(new BigDecimal("0.1234"));
        expect = "12,34%";
        result = ProductService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);

        product.setDiscount(new BigDecimal("0.99349"));
        expect = "99,35%";
        result = ProductService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);

        product.setDiscount(new BigDecimal("1"));
        expect = "100,00%";
        result = ProductService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);
    }

    @Test(expected = NumberFormatException.class)
    public void testValueDiscountMore100Percent() {
        product.setDiscount(new BigDecimal("1,12"));
        ProductService.getPercentageDiscount(product);
    }


    @Test
    public void getPriceWithDiscount() {
        var productService = new ProductService();
        var product = ProductTest.getDefaultProduct();
        product.setPrice(new BigDecimal("100"));
        product.setDiscount(new BigDecimal("20"));
        var actual = productService.getPriceWithDiscount(product);
        Assert.assertEquals(new BigDecimal("80.00"), actual);
    }
}