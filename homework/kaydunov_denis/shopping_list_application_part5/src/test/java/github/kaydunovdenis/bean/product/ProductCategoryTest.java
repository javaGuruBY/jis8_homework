package github.kaydunovdenis.bean.product;

import org.junit.Assert;
import org.junit.Test;

public class ProductCategoryTest {

    @Test
    public void valueOf() {
        Assert.assertEquals(ProductCategory.PHONE, ProductCategory.valueOf("PHONE"));
    }

}