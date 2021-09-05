package github.kaydunovdenis;

import org.junit.Test;

public class ShoppingListApplicationTest {

    @Test(expected = UnsupportedOperationException.class)
    public void main() {
        ShoppingListApplication.main(new String[]{});
    }
}
