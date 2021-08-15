package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductTest;
import github.kaydunovdenis.service.product_validator.PriceValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.ProductTest.getDefaultProduct;
import static org.junit.Assert.*;

public class PriceValidatorTest {
    private PriceValidator priceValidator;

    @Before
    public void setUp() {
        priceValidator = new PriceValidator();
    }

    @Test
    public void validatePositiveScenario() {
        Product product = getDefaultProduct();
        product.setPrice(new BigDecimal("10.032"));
        assertTrue(priceValidator.validate(product));
    }

    @Test
    public void validateNegativeScenario() {
        Product product = getDefaultProduct();
        product.setPrice(new BigDecimal("-12.3"));
        Assert.assertFalse(priceValidator.validate(product));

        product.setPrice(new BigDecimal("0"));
        Assert.assertFalse(priceValidator.validate(product));
    }
}
