package github.kaydunovdenis.bean.product;

import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ProductCategoryTest {

    @Test
    public void containPositive() {
        assertTrue(ProductCategory.contain(ProductCategory.valueOf("PHONE")));
    }

    @Test
    public void containNegative() {
       // assertTrue(ProductCategory.contain(ProductCategory.valueOf("PHY")));
        assertThrows(IllegalArgumentException.class,
                () -> ProductCategory.valueOf("PHY"));
    }
}
