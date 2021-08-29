package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartRepository {
    //TODO Реализовать валидатор имени для корзины
    private final Map<String, ShoppingCart> shoppingCarts = new HashMap<>();

    public ShoppingCartRepository() {
    }

    public Map<String, ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public ShoppingCart removeShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCarts.remove(shoppingCart.getName());
    }

    //TODO Задание: реализовать функцию получения корзины
    // правильно ли я понял это задание? Я получаю корзину по её имени
    public ShoppingCart getShoppingCartByName(String nameShoppingCart) {
        return shoppingCarts.get(nameShoppingCart);
    }

    /**
     * Add new shopping cart or update old shopping cart in repository
     */
    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCarts.put(shoppingCart.getName(), shoppingCart);
    }
}
