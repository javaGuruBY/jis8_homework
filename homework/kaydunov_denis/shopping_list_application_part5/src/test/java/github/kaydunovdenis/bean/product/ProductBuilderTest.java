package github.kaydunovdenis.bean.product;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductBuilderTest {

    @Test
    public void build() {
        var product = TestProductProvider.getTestProduct();
        var resultProduct = new ProductBuilder().id(product.getId())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .name(product.getName())
                .productCategory(product.getProductCategory())
                .price(product.getPrice())
                .build();

        assertEquals(product, resultProduct);
    }
}
