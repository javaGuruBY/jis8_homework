package github.kaydunovdenis.service.validator;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductValidatorTest {
    private ProductValidatorService productValidatorService;
    private Product product;

    @Before
    public void setUp() throws Exception {
        //TODO переписать чтобы не было null
        productValidatorService = TestValidatorProvider.productValidatorService;
        product = getAnotherTestProduct();
    }

    @Ignore("redundant, будет актуально если тесты писать подключая Spring context, а не TestValidatorProvider")
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
