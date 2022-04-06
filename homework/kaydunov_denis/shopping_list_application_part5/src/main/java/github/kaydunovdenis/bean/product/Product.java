package github.kaydunovdenis.bean.product;

import github.kaydunovdenis.bean.Entity;
import github.kaydunovdenis.service.ProductService;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * About the discount:
 * value variable 1 = view 100,00%
 * value variable 0.2 = view 20,00%
 * @see ProductConstants;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!Objects.equals(id, product.id)) return false;
        if (!Objects.equals(name, product.name)) return false;
        if (!Objects.equals(price, product.price)) return false;
        if (productCategory != product.productCategory) return false;
        if (!Objects.equals(discount, product.discount) || discount.compareTo(product.discount) != 0) return false;
        return Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (productCategory != null ? productCategory.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
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
