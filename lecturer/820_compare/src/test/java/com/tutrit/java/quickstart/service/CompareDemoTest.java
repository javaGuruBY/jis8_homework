package com.tutrit.java.quickstart.service;

import static com.tutrit.java.quickstart.service.HumanComparatorUtil.*;
import static org.junit.Assert.*;

import com.tutrit.java.quickstart.bean.Human;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class CompareDemoTest {

    @Test
    public void run() {
        List<Human> humanList = new ArrayList<>(List.of(
                new Human("Max", 37, 164),
                new Human("Pavel", 28, 170),
                new Human("Artemij", 28, 170),
                new Human("Artemij", 28, 120),
                new Human("Oksana", 18, 147)
        ));

        Collections.sort(humanList, ((Comparator<Human>) (o1, o2) -> o1.name.compareTo(o2.name)).reversed());

        Collections.sort(humanList, (
                (Comparator<Human>) (o1, o2) -> o1.name.compareTo(o2.name))
                .thenComparing((Comparator<Human>) (o1, o2) -> o1.age - o2.age));

        Collections.sort(humanList, Collections.reverseOrder());
        humanList.sort((o1, o2) -> {
                    if (o2.age == o1.age) {
                        if (o1.name.equals(o2.name)) {
                            return o1.height - o2.height;
                        }
                        return o1.name.compareTo(o2.name);
                    }
                    return o2.age - o1.age;
                }
        );
        humanList.sort(COMPARE_AGE_NAME_HEIGHT_REVERSED);
        Collections.sort(humanList, COMPARE_AGE_NAME_HEIGHT.thenComparing(getComparatorByName()));

        System.out.println("humanList = " + humanList);
    }
}