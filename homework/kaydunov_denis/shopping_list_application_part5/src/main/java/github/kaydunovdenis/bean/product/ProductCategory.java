package github.kaydunovdenis.bean.product;

import java.util.List;

public enum ProductCategory {
    NOTEBOOK,
    COMPUTER,
    PHONE,
    TABLET;

    public static boolean contain(ProductCategory category) {
        try {
            return List.of(ProductCategory.values()).contains(category);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

