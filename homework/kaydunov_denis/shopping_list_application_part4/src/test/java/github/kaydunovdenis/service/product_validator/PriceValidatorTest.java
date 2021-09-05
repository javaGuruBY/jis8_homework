package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductTest.getDefaultProduct;
import static org.junit.Assert.*;

public class PriceValidatorTest {
    private PriceValidator priceValidator;
    private Product product;

    @Before
    public void setUp() {
        priceValidator = new PriceValidator();
        product = getDefaultProduct();
    }

    @Test
    public void validatePositiveScenario() {
        product.setPrice(new BigDecimal("10.032"));
        assertTrue(priceValidator.validate(product));
    }

    @Test
    public void validateNegativeScenario() {
        product.setPrice(new BigDecimal("-12.3"));
        Assert.assertFalse(priceValidator.validate(product));

        product.setPrice(new BigDecimal("0"));
        Assert.assertFalse(priceValidator.validate(product));
    }
}
