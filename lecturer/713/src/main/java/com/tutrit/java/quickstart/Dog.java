package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Human;
import com.tutrit.java.quickstart.service.HumanProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dog {

    public static void main(String[] args) {
        List<Human> humans = HumanProvider.getHumans(10);

        for (int k = 0; k < humans.size(); k++) {
            System.out.println("humans.get(k) = " + humans.get(k));
        }
        System.out.println();
        for(Human human : humans) {
            System.out.println("human = " + human);
        }
        System.out.println();
        humans.forEach(human -> System.out.println("human = " + human));
        Set<Human> humanSet = new HashSet<>(humans);
        humanSet.forEach(human -> System.out.println("human = " + human));
        System.out.println("Stream");
        humanSet.stream().forEach(human -> System.out.println("human = " + human));

        Map<String, Human> humanMap = new HashMap<>();
        humanMap.put("first", new Human("max", 34));
        humanMap.put("second", new Human("bax", 66));

        humanMap.keySet().forEach(key -> System.out.println("key = " + key));
        humanMap.values().forEach(human -> System.out.println("human = " + human));

        humanMap.forEach((key, value) -> System.out.println("key = " + key + "value = " + value));

        findDima();

    }

    public static void findDima() {
        List<Human> persons = HumanProvider.getHumans();
        for (Human person : persons) {
            if(person.getName().equals("dima")) {
                System.out.println("person = " + person);
            }
        }

        Map<String, Human> personMap = persons.stream()
                .collect(Collectors.toMap(human -> human.getName(), Function.identity()));

        System.out.println("personMap.get(\"dima\") = " + personMap.get("dima"));
    }
}

