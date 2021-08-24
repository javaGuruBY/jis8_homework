package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Human;
import java.util.Comparator;

public class HumanComparator implements Comparator <Human> {



    @Override
    public int compare(Human o1, Human o2) {
        if (o2.age == o1.age) {
            if (o1.name.equals(o2.name)) {
                return o1.height - o2.height;
            }
            return o1.name.compareTo(o2.name);
        }
        return o2.age - o1.age;
    }
}
