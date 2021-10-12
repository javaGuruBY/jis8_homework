package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductConstants;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class ProductService {

    public BigDecimal getPriceWithDiscount(final Product product) {
        return product.getPrice().multiply(getCoefficientDiscount(product));
    }

    private BigDecimal getCoefficientDiscount(Product product) {
        return (new BigDecimal(ProductConstants.MAX_DISCOUNT))
                .subtract(product.getDiscount())
                .divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
    }

    public static String getPercentageDiscount(Product product) {
        return ProductConstants.DECIMAL_FORMAT.format(product.getDiscount().multiply(BigDecimal.valueOf(100))) + "%";
    }
}
