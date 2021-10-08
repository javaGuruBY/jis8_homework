package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;

import static github.kaydunovdenis.bean.product.ProductTest.getTestProduct;

public class NullValidatorTest {
    private NullProductValidator nullValidator;
    private Product product;

    @Before
    public void setUp() {
        nullValidator = new NullProductValidator();
        product = getTestProduct();
    }

    @Test
    public void validatePositive() {
        nullValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void validateNegative() {
        nullValidator.validate(null);
    }
}
