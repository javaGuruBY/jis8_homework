package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductCategory;
import github.kaydunovdenis.bean.product.ProductTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

import static github.kaydunovdenis.bean.product.ProductTest.*;

public class ProductRepositoryHashMapTest {
    private Product product;

    @Before
    public void setUp() {
        ProductRepositoryHashMap.clear();
        product = getDefaultProduct();
    }
    
    @Test
    public void productMapShouldBeInitailizedOnStart() {
        Assert.assertNotNull(ProductRepositoryHashMap.getProductMap());
    }
    
    @Test
    public void productMapShouldBeEmptyOnStart() {
       Assert.assertEquals(0, ProductRepositoryHashMap.getProductMap().size());       
       ProductRepositoryHashMap.getProductMap().put(product.getName(), product);
       Assert.assertEquals(1, ProductRepositoryHashMap.getProductMap().size());
    }
    

    @Test
    public void containsProduct() {
        Assert.assertFalse(ProductRepositoryHashMap.containsProduct(product));

        ProductRepositoryHashMap.getProductMap().put(product.getName(), product);
        Assert.assertTrue(ProductRepositoryHashMap.containsProduct(product));
    }

    public static void initialRepository(Map<String, Product> productMap) {
        var tempProduct = new Product(1L,
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
