package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryHashMapImpl implements Repository<Product> {
    private static final Map<String, Product> repository = new HashMap<>();

    public Map<String, Product> getRepository() {
        return repository;
    }

    public boolean contain(Product product) {
        return repository.containsKey(product.getName());
    }
}
