package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartRepositoryHashMapImpl implements Repository<ShoppingCart> {
    private final Map<String, ShoppingCart> repository = new HashMap<>();

    @Override
    public Map<String, ShoppingCart> getRepository() {
        return repository;
    }

    @Override
    public boolean contain(ShoppingCart shoppingCart) {
        return repository.containsKey(shoppingCart.getName());
    }

    public void removeShoppingCart(ShoppingCart shoppingCart) {
        repository.remove(shoppingCart.getName());
    }

    public ShoppingCart getShoppingCartByName(String nameShoppingCart) {
        return repository.get(nameShoppingCart);
    }

    /**
     * Add new shopping cart or update old shopping cart in repository
     */
    public void saveShoppingCart(ShoppingCart shoppingCart) {
        addShoppingCart(shoppingCart);
    }

    public void addShoppingCart(final ShoppingCart shoppingCart) {
        repository.put(shoppingCart.getName(), shoppingCart);
    }
}
