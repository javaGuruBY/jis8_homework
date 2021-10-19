package com.tutrit.java.quickstart.bean.bean.thread.deadLock;

import lombok.SneakyThrows;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeadLock {

    String one = " one";
    String two = " two";

    Logger log = LoggerFactory.getLogger("ThreadState");


    @SneakyThrows
    public void perform(){
        Thread oneTwo = new Thread(this::oneTwo);
        Thread twoOne = new Thread(this::twoOne);

        oneTwo.start();
        twoOne.start();
    }

    @SneakyThrows
    public void oneTwo()  {
        for (int i = 0 ; i<1000000; i++){
            synchronized (one) {
                log.info("Lock one");
                Thread.sleep(100);
                synchronized (two){
                    log.info("Lock two");
                }
            }
        }
    }

    @SneakyThrows
    public void twoOne() {
        for (int i = 0 ; i<1000000; i++){
            synchronized (two) {
                log.info("Lock two");
                Thread.sleep(100);
                synchronized (one){
                    log.info("Lock one");
                }
            }
        }
    }
}
