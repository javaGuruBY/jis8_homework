package com.tutrit.java.quickstart.bean;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<Human> peoples = new ArrayList<>();

    public List<Human> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<Human> peoples) {
        this.peoples = peoples;
    }
}
