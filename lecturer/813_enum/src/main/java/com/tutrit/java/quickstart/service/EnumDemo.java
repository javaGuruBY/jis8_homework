package com.tutrit.java.quickstart.service;

import static com.tutrit.java.quickstart.constant.Sex.*;

import com.tutrit.java.quickstart.bean.Human;
import com.tutrit.java.quickstart.constant.Sex;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class EnumDemo {

    private static EnumMap<Sex, List<Human>> genderMap = new EnumMap<>(Sex.class);

    static {
        genderMap.put(M, new ArrayList<>());
        genderMap.put(F, new ArrayList<>());
    }

    public void run(Human human) {
        switch (human.getSex()) {
            case M -> genderMap.get(M).add(human);
            case F -> genderMap.get(F).add(human);
        }
    }

    public int getTotal(Sex gender) {
        return genderMap.get(gender).size();
    }
}
