package github.kaydunovdenis.bean;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    private String nameCart = "Cart#1";
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart(nameCart);
    }

    @Test
    public void getName() {
        Assert.assertEquals(nameCart, shoppingCart.getName());
    }

    @Test
    public void setName() {
        shoppingCart.setName("CART#2");
        Assert.assertEquals("CART#2", shoppingCart.getName());
    }

    @Test
    public void getProductList() {
        List<Product> productList = shoppingCart.getProductList();
        Assert.assertNotNull(productList);
        Assert.assertEquals(0, productList.size());
    }

    @Test
    public void setProductList() {
        List<Product> productList = new LinkedList<>();
        shoppingCart.setProductList(productList);
        Assert.assertNotNull(productList);
        Assert.assertEquals(0, productList.size());
    }

    @Test
    public void testEquals() {
        EqualsVerifier.simple().forClass(Product.class).verify();
    }

    @Test
    public void testHashCode() {
        EqualsVerifier.simple().forClass(Product.class).verify();
    }

    @Test
    public void testToString() {
        String expected = "ShoppingCart{name='Cart#1', productList=[]}";
        Assert.assertEquals(expected, shoppingCart.toString());
    }
}