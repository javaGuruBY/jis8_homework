package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;
import github.kaydunovdenis.bean.ProductConstants;

import java.math.BigDecimal;

public class ProductPrintService {

    private ProductPrintService() {
    }

    public static String getPercentageDiscount(Product product) {
        return ProductConstants.DECIMAL_FORMAT.format(product.getDiscount().multiply(BigDecimal.valueOf(100))) + "%";
    }
}
