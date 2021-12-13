package com.tutrit.hibernateinspring.bean;

public enum PrimarySkill {
    JAVA("java"),
    JAVA_SCRIPT("js"),
    DOT_NET(".NET"),
    C_PLUS("C++");

    final String skill;

    PrimarySkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }
}
