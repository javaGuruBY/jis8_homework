package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductCategory;
import github.kaydunovdenis.bean.ProductTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

public class ProductRepositoryHashMapTest {

    @Before
    public void setUp() {
        ProductRepositoryHashMap.clear();
    }

    @Test
    public void getProductMap() {
        Assert.assertNotNull(ProductRepositoryHashMap.getProductMap());
        Assert.assertEquals(0, ProductRepositoryHashMap.getProductMap().size());

        Product product = ProductTest.getDefaultProduct();
        ProductRepositoryHashMap.getProductMap().put(product.getName(), product);
        Assert.assertEquals(1, ProductRepositoryHashMap.getProductMap().size());
    }

    @Test
    public void containsProduct() {
        Product product = ProductTest.getDefaultProduct();
        Assert.assertFalse(ProductRepositoryHashMap.containsProduct(product));

        ProductRepositoryHashMap.getProductMap().put(product.getName(), product);
        Assert.assertTrue(ProductRepositoryHashMap.containsProduct(product));
    }

    public static void initialRepository(Map<String, Product> productMap) {
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