package github.kaydunovdenis.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private Long id;
    private BigDecimal price;
    private Category productCategory;
    private BigDecimal discount;
    private String description;
}
