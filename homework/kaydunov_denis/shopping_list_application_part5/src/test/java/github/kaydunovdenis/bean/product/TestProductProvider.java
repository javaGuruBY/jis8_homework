package github.kaydunovdenis.bean.product;

import java.math.BigDecimal;

public class TestProductProvider {

    public Product getTestProduct() {
        return new ProductBuilder()
                .id(10L)
                .name("Notebook Acer 9302V-1")
                .price(new BigDecimal("100.23"))
                .productCategory(ProductCategory.NOTEBOOK)
                .discount(new BigDecimal("0.1"))
                .description("not description")
                .build();
    }
}
