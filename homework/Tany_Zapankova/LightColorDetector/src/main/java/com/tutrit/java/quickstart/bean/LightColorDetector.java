package com.tutrit.java.quickstart.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightColorDetector {

    Logger log = LoggerFactory.getLogger("");

    public void detector (){


        int wavelength = 0;
        if (wavelength >= 380 && wavelength <= 449)
            log.info("Violet");
        else if (wavelength >= 450 && wavelength <= 494)
            log.info("Blue");
        else if (wavelength >= 495 && wavelength <= 569)
            log.info("Green");
        else if (wavelength >= 570 && wavelength <= 589)
            log.info("Yellow");
        else if (wavelength >= 590 && wavelength <= 619)
            log.info("Orange");
        else if (wavelength >= 620 && wavelength <= 750)
            log.info("Red");
        else
            log.info("Invisible Light");
    }
}
