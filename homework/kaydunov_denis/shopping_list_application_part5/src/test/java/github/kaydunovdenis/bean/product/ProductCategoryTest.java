package github.kaydunovdenis.bean.product;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductCategoryTest {

    @Test
    public void containPositive() {
        assertTrue(ProductCategory.contain(ProductCategory.valueOf("PHONE")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void containNegative() {
        assertFalse(ProductCategory.contain(ProductCategory.valueOf("PHY")));
    }
}
