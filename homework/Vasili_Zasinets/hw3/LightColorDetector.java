package jis8.java.homework.hw2;

public class LightColorDetector {
    String result;

    public String detect(int wavelength) {
        result = "";
        if (380 > wavelength && 750 < wavelength) {
            result = "Invisible Light";
        } else if (380 <= wavelength && 449 >= wavelength) {
            result = "Violet";
        } else if (450 <= wavelength && 494 >= wavelength) {
            result = "Blue";
        } else if (495 <= wavelength && 569 >= wavelength) {
            result = "Green";
        } else if (570 <= wavelength && 589 >= wavelength) {
            result = "Yellow";
        } else if (590 <= wavelength && 619 >= wavelength) {
            result = "Orange";
        } else if (620 <= wavelength && 750 >= wavelength) {
            result = "Red";
        }
        return result;
    }
}







