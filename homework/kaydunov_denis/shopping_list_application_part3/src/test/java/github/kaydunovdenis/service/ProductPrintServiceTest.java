package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ProductPrintServiceTest {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private Product product;

    @Before
    public void setUp() {
        product = ProductTest.getDefaultProduct();
    }

    @Test
    public void getPercentageDiscount() {
        String expect = ProductTest.DEFAULT_PERCENTAGE_DISCOUNT;
        String result = ProductPrintService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);

        product.setDiscount(new BigDecimal("0.1234"));
        expect = "12,34%";
        result = ProductPrintService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);

        product.setDiscount(new BigDecimal("0.99349"));
        expect = "99,35%";
        result = ProductPrintService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);

        product.setDiscount(new BigDecimal("1"));
        expect = "100,00%";
        result = ProductPrintService.getPercentageDiscount(product);
        LOG.info("Expect:\n {}",expect);
        LOG.info("Result:\n {}", result);
        Assert.assertEquals(expect, result);
    }

    @Test(expected = NumberFormatException.class)
    public void testValueDiscountMore100Percent() {
        product.setDiscount(new BigDecimal("1,12"));
        String result = ProductPrintService.getPercentageDiscount(product);
    }
}