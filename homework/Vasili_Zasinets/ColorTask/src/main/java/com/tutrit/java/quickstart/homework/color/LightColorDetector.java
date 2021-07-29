package com.tutrit.java.quickstart.homework.color;

public class LightColorDetector {
    public String detect(int wavelength) {

        if (380 <= wavelength && 449 >= wavelength) {
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
        } else  return "Invisible Light";
    }
}
