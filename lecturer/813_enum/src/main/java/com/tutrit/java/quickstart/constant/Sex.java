package com.tutrit.java.quickstart.constant;

public enum Sex {
    M("male", "man", "boy", "m", "муж"),
    F("female", "women", "girl", "w", "жен");

    private final String genderEng;
    private final String sexEng;
    private final String childEng;
    private final String letterEng;
    private final String genderRus;

    Sex(String genderEng, String sexEng, String childEng, String letterEng, String genderRus) {
        this.genderEng = genderEng;
        this.sexEng = sexEng;
        this.childEng = childEng;
        this.letterEng = letterEng;
        this.genderRus = genderRus;
    }

    public String getGenderEng() {
        return genderEng;
    }

    public String getSexEng() {
        return sexEng;
    }

    public String getChildEng() {
        return childEng;
    }

    public String getLetterEng() {
        return letterEng;
    }

    public String getGenderRus() {
        return genderRus;
    }
}
