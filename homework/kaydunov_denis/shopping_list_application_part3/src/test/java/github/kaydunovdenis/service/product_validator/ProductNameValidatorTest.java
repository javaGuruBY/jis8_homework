package github.kaydunovdenis.service.product_validator;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductCategory;
import github.kaydunovdenis.repository.ProductRepositoryHashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
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
    public void validate() {
        validatePositiveScenario();
        validateNegativeScenario();
        isNameUnique();
    }

    @Test
    public void isNameUnique() {
        Map<String, Product> map = ProductRepositoryHashMap.getProductMap();
        initialRepository(map);

        Product product = getDefaultProduct();
        product.setName("Name1");
        map.put(product.getName(), product);
        Assert.assertFalse(productNameValidator.isNameUnique(product));

        product.setName("Name2");
        Assert.assertTrue(productNameValidator.isNameUnique(product));
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

    public void initialRepository(Map<String, Product> productMap) {
        Product tempProduct = new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                ProductCategory.NOTEBOOK,
                new BigDecimal("0.02"),
                "Not description");
        productMap.put(tempProduct.getName(), tempProduct);

        tempProduct = new Product(2L,
                "Notebook Acer 9302V-2",
                new BigDecimal("1120.90"),
                ProductCategory.NOTEBOOK,
                new BigDecimal("0.2"),
                "Not description");
        productMap.put(tempProduct.getName(), tempProduct);

        tempProduct = new Product(3L,
                "Tablet Acer Nubia's",
                new BigDecimal("560.00"),
                ProductCategory.TABLET,
                new BigDecimal("0.53"),
                "New super tablet for woman");
        productMap.put(tempProduct.getName(), tempProduct);
    }
}
