package com.tutrit.java.quickstart.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleValuesService {

    public List<String> returnListCapitals() {
        return List.of("London", "Berlin", "Minsk");
    }

    public String[] returnArrayCapitals() {
//        String[] capitals = {"London", "Berlin", "Minsk"};
        return new String[]{"London", "Berlin", "Minsk"};
    }

    public Object[] returnArrayObjectCapitals() {
        return new Object[]{"London", "Berlin", "Minsk", 3};
    }

    public Map<Object, String> returnMapCapitals() {
        Map<Object, String> capitals = new HashMap<>();
        capitals.put("London", "capital");
        capitals.put("Berlin", "capital");
        capitals.put("Minsk", "capital");
        capitals.put(3, "total");
        capitals.put("c.London", "Most populated");
        capitals.put(100000000000L, "peoples");
        return capitals;
    }

    public Map<String, Object> returnMapCapitalsNaoborot() {
        Map<String, Object> capitals = new HashMap<>();
        capitals.put("id1", "London");
        capitals.put("id2", "Berlin");
        capitals.put("id3", "Minsk");
        capitals.put("total", 3);
        capitals.put("Most populated", "London");
        capitals.put("peoples in most populated", 100000000000L);
        return capitals;
    }
}
