package homework.shop;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;



public class ShopTest {
    Shop myTestShop = new Shop();
    Logger log = LoggerFactory.getLogger("Shop ");


    @Test
    public void addProduct() {
        myTestShop.addProduct("milk", BigDecimal.valueOf(15.89));
        myTestShop.addProduct("water", BigDecimal.valueOf(1.001));
        myTestShop.addProduct("bread", BigDecimal.valueOf(0.19));
        log.info("Product in shop : {}", myTestShop);
    }

    @Test
    public void deleteProduct() {
        myTestShop.addProduct("milk", BigDecimal.valueOf(15.89));
        myTestShop.addProduct("water", BigDecimal.valueOf(1.001));
        myTestShop.addProduct("bread", BigDecimal.valueOf(0.19));
        myTestShop.deleteProduct("water");
        log.info("Product  : {}", myTestShop);
    }

    @Test
    public void shProduct() {
        myTestShop.addProduct("milk", BigDecimal.valueOf(15.89));
        myTestShop.addProduct("water", BigDecimal.valueOf(1.001));
        myTestShop.addProduct("bread", BigDecimal.valueOf(0.19));
        myTestShop.shProduct("bread");
    }

    @Test
    public void findProduct() {

    }
}