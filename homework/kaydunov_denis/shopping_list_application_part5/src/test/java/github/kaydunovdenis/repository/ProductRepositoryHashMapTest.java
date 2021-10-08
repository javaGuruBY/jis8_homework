package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static github.kaydunovdenis.bean.product.ProductTest.getTestProduct;

public class ProductRepositoryHashMapTest {
    private Repository<Product> mockProductRepository;
    private Repository<Product> realProductRepository;
    private Product product;

    @Before
    public void setUp() {
        mockProductRepository = new MockProductRepository();
        realProductRepository = new ProductRepositoryHashMapImpl();
        product = getTestProduct();
    }

    @Test
    public void productMapShouldBeInitializedOnStart() {
        Assert.assertNotNull(realProductRepository.getRepository());
    }

    @Test
    public void getProductMap() {
        Assert.assertTrue(realProductRepository.getRepository() instanceof HashMap);
    }

    @Test
    public void containsProduct() {
        Assert.assertFalse(mockProductRepository.contain(product));

        mockProductRepository.getRepository().put(product.getName(), product);
        Assert.assertTrue(mockProductRepository.contain(product));
    }
}