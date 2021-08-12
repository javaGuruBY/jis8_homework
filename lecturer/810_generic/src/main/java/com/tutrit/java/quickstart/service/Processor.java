package com.tutrit.java.quickstart.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Processor<T> {
    // два перегруженных метода
    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test(List<Integer> integerList) {
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

    //какой из методов будет вызван?
    public void run() {
        Processor<Object> processor = new Processor();
        List<String> list = Arrays.asList("1");
        processor.test(list);
    }
}
