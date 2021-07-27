package com.tutrit.java.quickstart.service;

public class WrapperKiller {
    public static void run() throws InterruptedException {
        int[] integers = new int[4000000];
        for (int i = 0; i < 4_000_000; i++) {
            integers[i] = i;
            System.out.println(i);
        }
    }
}
