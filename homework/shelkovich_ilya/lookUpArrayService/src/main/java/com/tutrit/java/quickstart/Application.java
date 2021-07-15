package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.LookUpArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger("");

    public static void main(String[] args) {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();

        int[] array = new int[]{1, 4, 7, 12};

        log.info("Max is: {}", lookUpArrayService.findMax(array));
        log.info("Min is : {}", lookUpArrayService.findMin(array));
        log.info("Index of max is : {}", lookUpArrayService.indexOfMax(array));
        log.info("index of min is : {}", lookUpArrayService.indexOfMin(array));
        log.info("Index of 7 is: {}", lookUpArrayService.indexOf(array, 7));

    }
}

