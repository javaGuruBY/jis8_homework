package github.kaydunovdenis.bean.product;

import java.math.BigDecimal;

/**
 * Used Pattern Builder
 */
public class ProductBuilder {
    private Long id;
    private String name;
    private BigDecimal price;
    private ProductCategory productCategory;
    private BigDecimal discount;
    private String description;

    public ProductBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ProductBuilder productCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public ProductBuilder discount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public ProductBuilder description(String description) {
        this.description = description;
        return this;
    }

    public Product build() {
        return new Product(this.id,
                this.name,
                this.price,
                this.productCategory,
                this.discount,
                this.description);
    }
}
