package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.ProductTest;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ProductRepositoryTest {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private ProductRepository productRepository;

    @Before
    public void setUp() {
        productRepository = new ProductRepository();
    }
}
