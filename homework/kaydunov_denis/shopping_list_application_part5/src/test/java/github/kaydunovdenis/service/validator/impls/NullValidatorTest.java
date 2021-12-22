package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;

import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;

public class NullValidatorTest {
    private NullProductValidator nullValidator;
    private Product product;

    @Before
    public void setUp() {
        nullValidator = new NullProductValidator();
        product = getAnotherTestProduct();
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
