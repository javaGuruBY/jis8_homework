package com.tutrit.java.quickstart.simplefactory.provider;

public class Fabric {

    public static Provider getStudentProvider(String type) {
        return switch (type) {
            case "en_US" -> new StudentProviderGe();
            case "ru_RU" -> new StudentProviderBy();
            default -> new StudentProvider();
        };
    }
}
