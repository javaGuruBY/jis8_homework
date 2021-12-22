package github.kaydunovdenis.bean.product;

import java.math.BigDecimal;

public class TestProductProvider {

    public static final String DEFAULT_DISCOUNT = "0.2";
    public static final String DEFAULT_PERCENTAGE_DISCOUNT = "20,00%";

    public static Product getTestProduct() {
        return new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                ProductCategory.NOTEBOOK,
                new BigDecimal(DEFAULT_DISCOUNT),
                "Not description");
    }

    public static Product getAnotherTestProduct() {
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
