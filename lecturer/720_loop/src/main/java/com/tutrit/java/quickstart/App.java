package com.tutrit.java.quickstart;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

    public static void main(String[] args, Integer var) {
        Set<String> s = new HashSet();
        s.add("a");
        s.add("bb");
        s.add("ccc");
        for(int i = 0; i++ < 10;) {

        }
        for (String obj : s) {
            if (obj.equals("bb")) {

            }
            System.out.println(obj);

        }
    }
}

