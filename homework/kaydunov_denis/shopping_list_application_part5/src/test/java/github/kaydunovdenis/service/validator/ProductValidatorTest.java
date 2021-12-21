package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ProductValidatorTest {
    @Autowired
    private ProductValidatorService productValidatorService;
    private Product product;

    @Before
    public void setUp() throws Exception {
        product = getAnotherTestProduct();
    }

    @Test
    public void listValidatorsShouldBeFilledOnStart() {
        assertTrue(productValidatorService.getList().size() > 0);
    }

    @Test
    public void validatePositive() {
        assertTrue(productValidatorService.validate(product));
    }

    @Test
    public void validateNegative() {
        product.setName(null);
        assertFalse(productValidatorService.validate(product));
    }
}
