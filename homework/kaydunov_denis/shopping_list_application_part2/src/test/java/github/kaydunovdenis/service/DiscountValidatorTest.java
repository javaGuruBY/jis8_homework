package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductTest;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiscountValidatorTest {
    private DiscountValidator discountValidator;

    @Before
    public void setUp() {
        discountValidator = new DiscountValidator();
    }

    @Test
    public void validatePositiveScenario() {
        Product product = ProductTest.getDefaultProduct();
        product.setDiscount(new BigDecimal("0.0"));
        assertTrue(discountValidator.validate(product));

        product.setDiscount(new BigDecimal("11.32"));
        assertTrue(discountValidator.validate(product));

        product.setDiscount(new BigDecimal("100.0"));
        assertTrue(discountValidator.validate(product));
    }

    @Test
    public void validateNegativeScenario() {
        Product product = ProductTest.getDefaultProduct();
        product.setDiscount(new BigDecimal("-11.22"));
        assertFalse(discountValidator.validate(product));

        product.setDiscount(new BigDecimal("111.32"));
        assertFalse(discountValidator.validate(product));
    }
}
