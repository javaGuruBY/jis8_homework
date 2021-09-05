package github.kaydunovdenis.bean;

import github.kaydunovdenis.bean.product.Product;
import github.kaydunovdenis.bean.shopping_cart.ShoppingCart;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    private final String nameCart = "Cart#1";
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart(nameCart);
    }

    @Test
    public void constructorTest() {
        shoppingCart = new ShoppingCart("CART#4", new ArrayList<>());
        Assert.assertNotNull(shoppingCart.getName());
        Assert.assertNotNull(shoppingCart.getProductList());
    }

    @Test
    public void getName() {
        assertEquals(nameCart, shoppingCart.getName());
    }

    @Test
    public void setName() {
        shoppingCart.setName("CART#2");
        assertEquals("CART#2", shoppingCart.getName());
    }

    @Test
    public void getProductList() {
        List<Product> productList = shoppingCart.getProductList();
        Assert.assertNotNull(productList);
        assertEquals(0, productList.size());
    }

    @Test
    public void setProductList() {
        List<Product> productList = new LinkedList<>();
        shoppingCart.setProductList(productList);
        Assert.assertNotNull(productList);
        assertEquals(0, productList.size());
    }

    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier.simple().forClass(ShoppingCart.class).verify();
        ShoppingCart s1 = new ShoppingCart("CART1");
        ShoppingCart s2 = new ShoppingCart("CART1");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
        ShoppingCart s3 = new ShoppingCart("CART1", new ArrayList<>());
        ShoppingCart s4 = new ShoppingCart("CART1", new ArrayList<>());
        assertEquals(s3, s4);
        assertEquals(s3.hashCode(), s4.hashCode());
    }

    @Test
    public void testToString() {
        String expected = "ShoppingCart{name='Cart#1', productList=[]}";
        assertEquals(expected, shoppingCart.toString());
    }
}