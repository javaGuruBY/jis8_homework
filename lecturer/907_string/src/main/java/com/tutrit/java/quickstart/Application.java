package com.tutrit.java.quickstart;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
        String c = "The world is mine";


        byte[] result = {77, 97, 120};
        IntStream.range(0, result.length)
                .boxed()
                .map(i -> result[i])
                .map(aByte -> (char) aByte.byteValue())
                .forEach(System.out::print);

    }
}
