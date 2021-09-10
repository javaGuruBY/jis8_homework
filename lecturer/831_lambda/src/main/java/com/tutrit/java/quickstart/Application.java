package com.tutrit.java.quickstart;



public class Application {


    public static void main(String[] args) {
        new Thread(() -> System.out.println("hello world")).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello2 world");
            }
        }).start();
    }
}
