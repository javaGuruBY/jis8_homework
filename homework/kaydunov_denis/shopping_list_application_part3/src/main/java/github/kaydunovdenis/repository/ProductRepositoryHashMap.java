package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryHashMap implements ProductRepository {
    private static final Map<String, Product> productMap = new HashMap<>();

    private ProductRepositoryHashMap() {
    }

    public static Map<String, Product> getProductMap() {
        return productMap;
    }

    public static boolean containsProduct(Product product) {
        return productMap.containsKey(product.getName());
    }

    public static void clear() {
        productMap.clear();
    }
}
