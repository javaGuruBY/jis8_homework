package github.kaydunovdenis.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductValidateServiceTest {
    private ProductValidateService productValidateService;

    @Before
    public void setUp() {
        productValidateService = new ProductValidateService();
    }

    @Test
    public void validatePrice() {
        BigDecimal price = new BigDecimal("-12.3");
        Assert.assertFalse(productValidateService.validatePrice(price));

        price = new BigDecimal("0");
        Assert.assertFalse(productValidateService.validatePrice(price));

        price = new BigDecimal("10.032");
        assertTrue(productValidateService.validatePrice(price));
    }

    @Test
    public void validateDiscount() {
        BigDecimal discount = new BigDecimal("-12.3");
        Assert.assertFalse(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("0.0");
        assertTrue(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("11.32");
        assertTrue(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("100.0");
        assertTrue(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("111.32");
        assertFalse(productValidateService.validateDiscount(discount));
    }

    @Test
    public void validateProductName() {
        String name = "Pr";
        assertFalse(productValidateService.validateProductName(name));

        name = "Pro";
        assertTrue(productValidateService.validateProductName(name));

        name = "ProductName";
        assertTrue(productValidateService.validateProductName(name));

        name = "SomeProductNameIs_Equal_32_Chars";
        assertTrue(productValidateService.validateProductName(name));

        name = "SomeProductNameIsMoreThan32_Chars";
        assertFalse(productValidateService.validateProductName(name));
    }
}