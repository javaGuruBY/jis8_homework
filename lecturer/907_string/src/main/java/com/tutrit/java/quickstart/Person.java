package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Human;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    final String name;
    String mutableName;

    final List<String> personList;
    final List<Human> humanList;

    public Person(String name) {
        this.name = name;
        this.personList = null;
        this.humanList = null;
        this.mutableName = null;
    }

    public Person(String name, List<String> personList) {
        this.name = name;
        this.personList = List.copyOf(personList);
        this.humanList = null;
        this.mutableName = null;
    }

    public Person(String name, List<String> personList, List<Human> humanList) {
        this.name = name;
        this.mutableName = null;
        this.personList = List.copyOf(personList);
        this.humanList = humanList.stream()
                .map(h -> new Human(h.getName()))
                .collect(Collectors.toUnmodifiableList());
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        return new Person(name);
    }

    public void setMutableName(String mutableName) {
        this.mutableName = mutableName;
    }


    public Person setPersonList(List<String> personList) {
        return new Person(new String(name), List.copyOf(personList), List.copyOf(humanList));
    }

    public Person setHumanList(List<Human> humanList) {
        return new Person(new String(name), List.copyOf(personList), List.copyOf(humanList));
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "mutableName='" + mutableName + '\'' +
                ", personList=" + personList +
                '}';
    }
}
