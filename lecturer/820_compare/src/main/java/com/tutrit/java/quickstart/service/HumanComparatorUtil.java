package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Human;
import java.util.Comparator;

public class HumanComparatorUtil {

    private HumanComparatorUtil() {
    }

    public static final Comparator<Human> COMPARE_AGE_NAME_HEIGHT = (o1, o2) -> {
        if (o2.age == o1.age) {
            if (o1.name.equals(o2.name)) {
                return o1.height - o2.height;
            }
            return o1.name.compareTo(o2.name);
        }
        return o2.age - o1.age;
    };

    public static final Comparator<Human> COMPARE_AGE_NAME_HEIGHT_REVERSED =
            COMPARE_AGE_NAME_HEIGHT.reversed();

    public static final Comparator<Human> COMPARING_CHAIN =
            COMPARE_AGE_NAME_HEIGHT.thenComparing(getComparatorByName());

    public static Comparator<Human> getComparatorByName() {
        return new HumanComparatorByName();
    }

    public static Comparator<Human> getOptimized() {
        return (o1, o2) -> {
            if (o2.age == o1.age) {
                if (o1.name.equals(o2.name)) {
                    return o1.height - o2.height;
                }
                return o1.name.compareTo(o2.name);
            }
            return o2.age - o1.age;
        };
    }
}
