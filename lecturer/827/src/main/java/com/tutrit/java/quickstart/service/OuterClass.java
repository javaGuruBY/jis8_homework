package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Human;
import java.util.Comparator;
import java.util.List;

public class OuterClass {
    public String name;
    public String secondName;
    public int age;
    public void getName() {

    }

    public CardDto getFullNameAndAge() {
        return new CardDto();
    }

    public void printCard(final CardDto fullNameAndAge, final String name) {
        StaticNestedClass staticNest = new StaticNestedClass();
        List.of(new Human()).sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return name.length();
            }
        });
    }

    public class CardDto {
        public String name;
        public String secondName;
        public int age;
    }

    public static class StaticNestedClass {
        public String name;
        public String secondName;
        public int age;

        public StaticNestedClass() {

        }
    }


}
