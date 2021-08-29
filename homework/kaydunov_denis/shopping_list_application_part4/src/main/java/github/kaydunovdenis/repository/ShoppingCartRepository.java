package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartRepository {
    private final Map<String, ShoppingCart> shoppingCarts = new HashMap<>();

    public Map<String, ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void removeShoppingCart(ShoppingCart shoppingCart) {
        shoppingCarts.remove(shoppingCart.getName());
    }

    public ShoppingCart getShoppingCartByName(String nameShoppingCart) {
        return shoppingCarts.get(nameShoppingCart);
    }

    /**
     * Add new shopping cart or update old shopping cart in repository
     */
    public void saveShoppingCart(ShoppingCart shoppingCart) {
        shoppingCarts.put(shoppingCart.getName(), shoppingCart);
    }
}
