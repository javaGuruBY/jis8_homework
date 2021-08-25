package github.kaydunovdenis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoppingListApplication {
    private static final Logger LOG = LoggerFactory.getLogger(ShoppingListApplication.class);

    private ShoppingListApplication() {
    }

    public static void main(String[] args) {
        LOG.info("Welcome to ShoppingList!");
        throw new UnsupportedOperationException();
    }
}
