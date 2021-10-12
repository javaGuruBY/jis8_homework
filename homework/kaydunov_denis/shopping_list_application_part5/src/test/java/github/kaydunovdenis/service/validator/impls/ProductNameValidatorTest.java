package github.kaydunovdenis.service.validator.impls;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.service.validator.ProductValidationException;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;
import static org.junit.Assert.assertThrows;

class ProductNameValidatorTest {
    private ProductNameValidator productNameValidator;
    private Product product;

    @BeforeEach
    @Before
    public void setUp() {
        productNameValidator = new ProductNameValidator();
        product = getAnotherTestProduct();
    }

    @Test(expected = ProductValidationException.class)
    public void checkNameNotEqualNull() {
        product.setName(null);
        productNameValidator.validate(product);
    }

    @ParameterizedTest()
    @ValueSource(strings = {"3__", "5____", "Name 32 symbols_________________"})
    void testPositive(String name) {
        product.setName(name);
        productNameValidator.validate(product);
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"Name is 33_symbols_______________", "2_"})
    void testNegative(String name) {
        product.setName(name);
        assertThrows(ProductValidationException.class,
                () -> productNameValidator.validate(product));
    }
}
