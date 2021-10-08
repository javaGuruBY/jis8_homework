package github.kaydunovdenis.service.product_validator.validityImpl;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.product_validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;

import static github.kaydunovdenis.bean.product.ProductTest.getTestProduct;

public class ProductNameValidatorTest {
    private ProductNameValidator productNameValidator;
    private Product product;

    @Before
    public void setUp() {
        productNameValidator = new ProductNameValidator();
        product = getTestProduct();
    }

    @Test(expected = ProductValidationException.class)
    public void checkNameNotEqualNull() {
        product.setName(null);
        productNameValidator.validate(product);
    }

    @Test
    public void checkLengthEqualMinLength() {
        product.setName("3__");
        productNameValidator.validate(product);
    }

    @Test
    public void chekLengthEqualIncludeValue() {
        product.setName("5____");
        productNameValidator.validate(product);
    }

    @Test
    public void checkLengthEqualMaxLength() {
        product.setName("Name 32 symbols_________________");
        productNameValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void shouldLessMaxLength() {
        product.setName("Name is 33_symbols_______________");
        productNameValidator.validate(product);
    }

    @Test(expected = ProductValidationException.class)
    public void shouldMoreMinLength () {
        product.setName("2_");
        productNameValidator.validate(product);
    }
}
