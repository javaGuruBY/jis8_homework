package com.tutrit.java.quickstart;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

import com.tutrit.java.quickstart.bean.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class CollectionsTest {

    private final Comparator<Person> personComparator =
            comparing(Person::getName).thenComparing(Person::getAge).reversed();

    @Test
    public void sort() {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("max", 23),
                new Person("kurt", 27)));

        Collections.sort(persons, comparing(Person::getName).thenComparing(Person::getAge).reversed());
        Collections.sort(persons, personComparator);
    }

    @Test
    public void sortInt() {
        List<Integer> integers = new ArrayList<>(List.of(4, 6, 2, 7, 8, 3));

        integers.sort(comparingInt(Integer::intValue));
        System.out.println("integers = " + integers);
    }
}
