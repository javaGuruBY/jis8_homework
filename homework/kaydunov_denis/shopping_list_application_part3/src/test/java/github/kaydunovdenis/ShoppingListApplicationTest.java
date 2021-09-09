package github.kaydunovdenis;

import org.junit.Test;

public class ShoppingListApplicationTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testMain() {
        ShoppingListApplication.main(new String[]{});
    }
}
