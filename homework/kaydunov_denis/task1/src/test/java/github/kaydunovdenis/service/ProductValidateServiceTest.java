package github.kaydunovdenis.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;

@SuppressWarnings("JUnit5AssertionsConverter")
class ProductValidateServiceTest {
    private ProductValidateService productValidateService;

    @BeforeEach
    void setUp() {
        productValidateService = new ProductValidateService();
    }

    @Test
    void validatePrice() {
        BigDecimal price = new BigDecimal("-12.3");
        Assertions.assertFalse(productValidateService.validatePrice(price));

        price = new BigDecimal("0");
        Assertions.assertFalse(productValidateService.validatePrice(price));

        price = new BigDecimal("10.032");
        Assertions.assertTrue(productValidateService.validatePrice(price));
    }

    @Test
    void validateDiscount() {
        BigDecimal discount = new BigDecimal("-12.3");
        Assertions.assertFalse(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("0.0");
        Assert.assertTrue(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("11.32");
        Assert.assertTrue(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("100.0");
        Assert.assertTrue(productValidateService.validateDiscount(discount));

        discount = new BigDecimal("111.32");
        assertFalse(productValidateService.validateDiscount(discount));
    }

    @Test
    void validateProductName() {
        String name = "Pr";
        assertFalse(productValidateService.validateProductName(name));

        name = "Pro";
        Assert.assertTrue(productValidateService.validateProductName(name));

        name = "ProductName";
        Assert.assertTrue(productValidateService.validateProductName(name));

        name = "SomeProductNameIs_Equal_32_Chars";
        Assert.assertTrue(productValidateService.validateProductName(name));

        name = "SomeProductNameIsMoreThan32_Chars";
        assertFalse(productValidateService.validateProductName(name));
    }
}