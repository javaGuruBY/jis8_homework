package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Product;

import java.math.BigDecimal;

import static github.kaydunovdenis.bean.ProductConstants.DECIMAL_FORMAT;

public class ProductPrintService {

    public static String getPercentageDiscount(Product product) {
        return DECIMAL_FORMAT.format(product.getDiscount().multiply(BigDecimal.valueOf(100))) + "%";
    }
}
