package com.tutrit.java.quickstart;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapForEachTest {

    @Test
    public void mapForEach() {
        Logger log = LoggerFactory.getLogger(AppTest.class);
        Map<String, BigDecimal> prices = new LinkedHashMap<>();
        prices.put("first", new BigDecimal(45.0));
        prices.put("second", new BigDecimal(34.3));

        for (Map.Entry<String, BigDecimal> entry : prices.entrySet()) {
            String k = entry.getKey();
            BigDecimal v = entry.getValue();

            if(v.compareTo(new BigDecimal(44.0)) > 0) {
                log.info("product {} has price {}", k, v);
            }
        }

        prices.forEach((k, v) -> {
            if(v.compareTo(new BigDecimal(44.0)) > 0) {
                log.info("product {} has price {}", k, v);
            }
        });

        prices.forEach(printProductWithPriceOver44);
    }

    BiConsumer<String, BigDecimal> printProductWithPriceOver44 = (k, v) -> {
        if(v.compareTo(new BigDecimal(44.0)) > 0) {
            Logger log = LoggerFactory.getLogger(AppTest.class);
            log.info("product {} has price {}", k, v);
        }
    };
}
