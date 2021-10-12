package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static github.kaydunovdenis.bean.product.TestProductProvider.getTestProduct;

public class RepositoryTest {
    private Repository<Product> repository;
    private Product product;

    @Before
    public void setUp() {
        repository = new MockProductRepository();
        product = getTestProduct();
    }

    @Test
    public void containNegative() {
        Assert.assertFalse(repository.getRepository().containsKey(product.getName()));
        Assert.assertFalse(repository.getRepository().containsValue(product));
    }

    @Test
    public void containPositive() {
        repository.add(product);
        Assert.assertTrue(repository.contain(product));
    }
}