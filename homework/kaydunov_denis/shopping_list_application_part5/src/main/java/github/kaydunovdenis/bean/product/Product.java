package github.kaydunovdenis.bean.product;

import github.kaydunovdenis.service.ProductService;
import lombok.Data;

import java.math.BigDecimal;

/**
 * About the discount:
 * value variable 1 = view 100,00%
 * value variable 0.2 = view 20,00%
 */
@Data
public class Product implements Entity {
    private Long id;
    private String name;
    private BigDecimal price;
    private ProductCategory productCategory;
    private BigDecimal discount;
    private String description;

    public Product() {
    }

    public Product(Long id, String name, BigDecimal price, ProductCategory productCategory, BigDecimal discount,
                   String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.discount = discount;
        this.description = description;
    }

    /**
     * @ProductConstants ProductConstants.MIN_DISCOUNT = 0;
     * ProductConstants.MAX_DISCOUNT = 100;
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * @see ProductConstants
     * default MIN_DISCOUNT = 0;
     * default MAX_DISCOUNT = 100;
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", discount=" + ProductService.getPercentageDiscount(this) +
                ", description='" + description + '\'' +
                '}';
    }

    public ProductBuilder builder() {
        return new ProductBuilder();
    }
}
