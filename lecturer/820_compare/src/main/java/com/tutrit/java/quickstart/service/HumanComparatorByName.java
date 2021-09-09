package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Human;
import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.name.compareTo(o2.name);
    }
}
