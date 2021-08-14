package github.kaydunovdenis.bean;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ProductTest {

    @Test
    public void getName() {
        Assert.assertEquals("Notebook Acer 9302V-1", getDefaultProduct().getName());
    }

    @Test
    public void getId() {
        Assert.assertEquals(0, getDefaultProduct().getId().compareTo(1L));
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(0, getDefaultProduct().getPrice().compareTo(new BigDecimal("1000.00")));
    }

    @Test
    public void getProductCategory() {
        Assert.assertEquals(ProductCategory.NOTEBOOK, getDefaultProduct().getProductCategory());
    }

    @Test
    public void getDiscount() {
        Assert.assertEquals(0, getDefaultProduct().getDiscount().compareTo(new BigDecimal("0.00")));
    }

    @Test
    public void getDescription() {
        Assert.assertEquals("Not description", getDefaultProduct().getDescription());
    }

    @Test
    public void setName() {
        String expect = "Name is change";
        Product product = getDefaultProduct();
        product.setName(expect);
        Assert.assertEquals(expect, product.getName());
    }

    @Test
    public void setId() {
        Product product = getDefaultProduct();
        product.setId(2L);
        Assert.assertEquals(0, product.getId().compareTo(2L));
    }

    @Test
    public void setPrice() {
        BigDecimal expect = new BigDecimal("2000.00");
        Product product = getDefaultProduct();
        product.setPrice(expect);
        Assert.assertEquals(0, product.getPrice().compareTo(expect));
    }

    @Test
    public void setProductCategory() {
        ProductCategory expect = ProductCategory.COMPUTER;
        Product product = getDefaultProduct();
        product.setProductCategory(expect);
        Assert.assertEquals(expect, product.getProductCategory());
    }

    @Test
    public void setDiscount() {
        BigDecimal expect = new BigDecimal("0.10");
        Product product = getDefaultProduct();
        product.setDiscount(expect);
        Assert.assertEquals(0, product.getDiscount().compareTo(expect));
    }

    @Test
    public void setDescription() {
        Product product = getDefaultProduct();
        String expect = "Description is change";
        product.setDescription(expect);
        Assert.assertEquals(expect, product.getDescription());
    }

    @Test
    public void testToString() {
        final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
        String expect = "Product{id=1, name='Notebook Acer 9302V-1', price=1000, productCategory=NOTEBOOK," +
                " discount=0, description='Not description'}";
        log.info("Expect: {}", expect);
        log.info("Result: {}", getDefaultProduct());
        Assert.assertEquals(expect, getDefaultProduct().toString());
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(getDefaultProduct(), getDefaultProduct());
    }

    @Test
    public void testHashCode() {
        EqualsVerifier.simple().forClass(Product.class).verify();
    }

    public static Product getDefaultProduct() {
        return new Product(1L,
                "Notebook Acer 9302V-1",
                new BigDecimal("1000.00"),
                ProductCategory.NOTEBOOK,
                new BigDecimal(0),
                "Not description");
    }
}
