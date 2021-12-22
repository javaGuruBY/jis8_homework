package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.HashMap;

import static github.kaydunovdenis.bean.product.TestProductProvider.getAnotherTestProduct;
import static github.kaydunovdenis.bean.product.TestProductProvider.getTestProduct;
import static org.junit.Assert.*;

public class ProductRepositoryHashMapTest {
    private static Repository<Product> mockProductRepository;
    private Repository<Product> realProductRepository;
    private static Product product1;
    private static Product product2;

    @BeforeClass
    @BeforeMethod
    @Before
    public void setUp() {
        mockProductRepository = new MockProductRepository();
        realProductRepository = new ProductRepositoryHashMapImpl();
        product1 = getTestProduct();
        product2 = getAnotherTestProduct();
        mockProductRepository.getRepository().put(product1.getName(), product1);
    }

    @Test
    public void productMapShouldBeInitializedOnStart() {
        assertNotNull(realProductRepository.getRepository());
    }

    @Test
    public void getProductMap() {
        assertTrue(realProductRepository.getRepository() instanceof HashMap);
    }


    @DataProvider(name = "dataProvider")
    public static Object[][] primeNumbers() {
        return new Object[][]{
                {true, product1},
                {false, product2}};
    }

    @org.testng.annotations.Test(dataProvider = "dataProvider")
    public void testMethod(boolean expected, Product product) {
        boolean result = mockProductRepository.contain(product);
        assertEquals(expected, result);
    }
}
