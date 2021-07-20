package com.tutrit.java.quickstart.service;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class IterableForEach {

    public void run() {
        Set<String> s = new HashSet<>();
        s.add("a");
        s.add("bb");
        s.add("ccc");

        s.forEach(el -> {
            System.out.println(el);
        });

        s.forEach(print);
        print.accept("df");
    }

    Consumer<String> print = el -> {
        System.out.println(el);
    };
}
