package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.TestProductProvider;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockShoppingCartRepository implements Repository<ShoppingCart> {
    private final Map<String, ShoppingCart> mockRepository = new HashMap<>();

    @Override
    public Map<String, ShoppingCart> getRepository() {
        return mockRepository;
    }

    public void initial() {
        var tempShoppingCart = new ShoppingCart();
        mockRepository.put(tempShoppingCart.getName(), tempShoppingCart);

        tempShoppingCart = new ShoppingCart("Test Cart #1 for MockRepository");
        mockRepository.put(tempShoppingCart.getName(), tempShoppingCart);

        tempShoppingCart = new ShoppingCart("Test Cart #2 for MockRepository",
                List.of(TestProductProvider.getTestProduct()));
        mockRepository.put(tempShoppingCart.getName(), tempShoppingCart);
    }
}
