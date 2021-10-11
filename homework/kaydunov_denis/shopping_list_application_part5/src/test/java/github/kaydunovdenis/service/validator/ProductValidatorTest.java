package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.TestProductProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductValidatorTest {
    private ProductValidator productValidator;
    private Product product;

    @Before
    public void setUp() throws Exception {
        productValidator = new ProductValidator();
        product = new TestProductProvider().getTestProduct();
    }

    @Test
    public void validate() {
        Assert.assertTrue(productValidator.getList().size() > 0);
    }
}