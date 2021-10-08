package github.kaydunovdenis.bean.product;

import org.junit.Assert;
import org.junit.Test;

public class ProductBuilderTest {

    @Test
    public void build() {
        var product = ProductTest.getTestProduct();
        var resultProduct = new ProductBuilder().id(product.getId())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .name(product.getName())
                .productCategory(product.getProductCategory())
                .price(product.getPrice())
                .build();

        Assert.assertEquals(product, resultProduct);
    }
}
