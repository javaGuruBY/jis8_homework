package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductTest;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PriceValidatorTest {
    private PriceValidator priceValidator;
    private Product product;

    @Before
    public void setUp() {
        priceValidator = new PriceValidator();
        product = ProductTest.getDefaultProduct();
    }

    @Test
    public void validate() {
        product.setPrice(new BigDecimal("-12.3"));
        assertFalse(priceValidator.validate(product));

        product.setPrice(new BigDecimal("0"));
        assertFalse(priceValidator.validate(product));

        product.setPrice(new BigDecimal("10.032"));
        assertTrue(priceValidator.validate(product));
    }
}
