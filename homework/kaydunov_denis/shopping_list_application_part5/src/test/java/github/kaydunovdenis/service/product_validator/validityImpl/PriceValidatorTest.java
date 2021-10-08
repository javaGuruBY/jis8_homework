package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.product.ProductTest.getTestProduct;

public class PriceValidatorTest {
    private PriceValidator priceValidator;
    private Product product;

    @Before
    public void setUp() {
        priceValidator = new PriceValidator();
        product = getTestProduct();
    }

    @Test
    public void validatePositiveScenario() {
        product.setPrice(new BigDecimal("10.032"));
        priceValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void validatePriceMustBeMoreZero() {
        product.setPrice(new BigDecimal("-12.3"));
        priceValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void validatePriceMustBeNotEqualZero() {
        product.setPrice(new BigDecimal("0"));
        priceValidator.validate(product);
    }
}
