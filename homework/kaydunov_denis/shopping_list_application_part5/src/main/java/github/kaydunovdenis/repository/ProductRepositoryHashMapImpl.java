package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryHashMapImpl implements Repository<Product> {
    private static final Map<String, Product> productRepository = new HashMap<>();

    public ProductRepositoryHashMapImpl() {
    }

    public Map<String, Product> getRepository() {
        return productRepository;
    }

    public boolean contain(Product product) {
        return productRepository.containsKey(product.getName());
    }
}
