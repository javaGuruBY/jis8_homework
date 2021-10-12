package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Before;
import org.junit.Test;

import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductValidatorTest {
    private ProductValidator productValidator;
    private Product product;

    @Before
    public void setUp() throws Exception {
        productValidator = new ProductValidator();
        product = getAnotherTestProduct();
    }

    @Test
    public void listValidatorsShouldBeFilledOnStart() {
        assertTrue(productValidator.getList().size() > 0);
    }

    @Test
    public void validatePositive() {
        assertTrue(productValidator.validate(product));
    }

    @Test
    public void validateNegative() {
        product.setName(null);
        assertFalse(productValidator.validate(product));
    }
}
