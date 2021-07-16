package com.github.pavelbopavel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrapperDemo {
    Logger log = LoggerFactory.getLogger(WrapperDemo.class);

    Integer integerConstructor = new Integer(5);
    Integer integerLiteral = 5;
    Integer integerValueOf = Integer.valueOf(5);
    Integer integerParse = Integer.parseInt("5");

    Double doubleConstructor = new Double(2.5);
    Double doubleLiteral = 2.5;
    Double doubleValueOf = Double.valueOf(2);
    Double doubleParse = Double.parseDouble("2.5");

}
