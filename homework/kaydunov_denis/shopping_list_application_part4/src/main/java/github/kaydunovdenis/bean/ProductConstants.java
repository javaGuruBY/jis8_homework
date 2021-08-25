package github.kaydunovdenis.bean;

import java.text.DecimalFormat;

public class ProductConstants {
    public static final int ZERO = 0;
    public static final int MIN_DISCOUNT = 0;
    public static final int MAX_DISCOUNT = 100;
    public static final int MIN_LENGTH_NAME = 3;
    public static final int MAX_LENGTH_NAME = 32;
    public static final int MIN_PRICE_WITH_DISCOUNT_AVAILABLE = 20;

    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("########0.00");

    private ProductConstants() {
    }
}
