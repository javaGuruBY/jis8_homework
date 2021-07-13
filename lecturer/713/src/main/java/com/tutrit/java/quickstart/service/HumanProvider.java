package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Human;
import java.util.ArrayList;
import java.util.List;

public class HumanProvider {

    public static List<Human> getHumans(int i) {
        List<Human> humans = new ArrayList<>();
        for (int k = 0; k < i; k++) {
            humans.add(new Human("human" + k, k));
        }
        return humans;
    }


    public static List<Human> getHumans() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("max", 34));
        humans.add(new Human("bax", 34));
        humans.add(new Human("tima", 34));
        humans.add(new Human("dima", 34));
        humans.add(new Human("olga", 34));
        humans.add(new Human("sasha", 34));
        return humans;
    }
}
