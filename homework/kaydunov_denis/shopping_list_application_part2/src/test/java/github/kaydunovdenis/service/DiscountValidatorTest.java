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
    private Product product;

    @Before
    public void setUp() {
        discountValidator = new DiscountValidator();
        product = ProductTest.getDefaultProduct();
    }

    @Test
    public void validate() {
        BigDecimal discount = new BigDecimal("-12.3");
        product.setDiscount(discount);
        assertFalse(discountValidator.validate(product));

        discount = new BigDecimal("0.0");
        product.setDiscount(discount);
        assertTrue(discountValidator.validate(product));

        discount = new BigDecimal("11.32");
        product.setDiscount(discount);
        assertTrue(discountValidator.validate(product));

        discount = new BigDecimal("100.0");
        product.setDiscount(discount);
        assertTrue(discountValidator.validate(product));

        discount = new BigDecimal("111.32");
        product.setDiscount(discount);
        assertFalse(discountValidator.validate(product));
    }
}
