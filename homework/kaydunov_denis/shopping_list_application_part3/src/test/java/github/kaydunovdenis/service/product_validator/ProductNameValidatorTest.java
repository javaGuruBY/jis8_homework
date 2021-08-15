package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.repository.ProductRepositoryHashMap;
import github.kaydunovdenis.repository.ProductRepositoryHashMapTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static github.kaydunovdenis.bean.ProductTest.getDefaultProduct;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductNameValidatorTest {
    private ProductNameValidator productNameValidator;

    @Before
    public void setUp() {
        productNameValidator = new ProductNameValidator();
    }

    @Test
    public void isNameUnique() {
        Map<String, Product> map = ProductRepositoryHashMap.getProductMap();
        ProductRepositoryHashMapTest.initialRepository(map);

        Product product = getDefaultProduct();
        product.setName("Name1");
        map.put(product.getName(), product);
        Assert.assertFalse(productNameValidator.validate(product));

        product.setName("Name2");
        Assert.assertTrue(productNameValidator.validate(product));
    }

    @Test
    public void checkNullMethodIsNameUnique() {
        Assert.assertFalse(productNameValidator.validate(null));
    }

    @Test
    public void validatePositiveScenario() {
        Product product = getDefaultProduct();
        product.setName("3__");
        Assert.assertTrue(productNameValidator.validate(product));

        product.setName("5____");
        Assert.assertTrue(productNameValidator.validate(product));

        product.setName("Name 32 symbols_________________");
        assertTrue(productNameValidator.validate(product));
    }

    @Test
    public void validateNegativeScenario() {
        Product product = getDefaultProduct();
        product.setName("2_");
        Assert.assertFalse(productNameValidator.validate(product));

        product.setName("Name 33_symbols__________________");
        assertFalse(productNameValidator.validate(product));
    }
}
