package github.kaydunovdenis.bean.product;

import org.junit.Assert;
import org.junit.Test;

public class ProductCategoryTest {

    @Test
    public void containPositive() {
        Assert.assertTrue(ProductCategory.contain(ProductCategory.valueOf("PHONE")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void containNegative() {
        Assert.assertFalse(ProductCategory.contain(ProductCategory.valueOf("PHY")));
    }
}
