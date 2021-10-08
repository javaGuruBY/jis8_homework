package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.product.ProductCategory;
import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
public class MockProductRepository implements Repository<Product> {
    private final Map<String, Product> mockProductMap = new HashMap<>();

    @Override
    public Map<String, Product> getRepository() {
        return mockProductMap;
    }

    @Override
    public boolean contain(Product product) {
        return mockProductMap.containsKey(product.getName());
    }

    public static void initial(Map<String, Product> productMap) {
        var tempProduct = new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                ProductCategory.NOTEBOOK,
                new BigDecimal("0.02"),
                "Not description");
        productMap.put(tempProduct.getName(), tempProduct);

        tempProduct = new Product(2L,
                "Notebook Acer 9302V-2",
                new BigDecimal("1120.90"),
                ProductCategory.NOTEBOOK,
                new BigDecimal("0.2"),
                "Not description");
        productMap.put(tempProduct.getName(), tempProduct);

        tempProduct = new Product(3L,
                "Tablet Acer Nubia's",
                new BigDecimal("560.00"),
                ProductCategory.TABLET,
                new BigDecimal("0.53"),
                "New super tablet for woman");
        productMap.put(tempProduct.getName(), tempProduct);
    }
}
