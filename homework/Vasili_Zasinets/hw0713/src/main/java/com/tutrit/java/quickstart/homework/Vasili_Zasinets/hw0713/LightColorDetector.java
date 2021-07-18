package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713;

public class LightColorDetector {
       public String detect(int wavelength) {

        if (380 > wavelength || 750 < wavelength) {
            return  "Invisible Light";
        } else if (380 <= wavelength && 449 >= wavelength) {
            return "Violet";
        } else if (450 <= wavelength && 494 >= wavelength) {
            return "Blue";
        } else if (495 <= wavelength && 569 >= wavelength) {
            return "Green";
        } else if (570 <= wavelength && 589 >= wavelength) {
            return "Yellow";
        } else if (590 <= wavelength && 619 >= wavelength) {
            return "Orange";
        } else if (620 <= wavelength && 750 >= wavelength) {
            return "Red";
        }
        return null;
    }
}
