package com.tutrit.java.quickstart.controller;

import com.tutrit.java.quickstart.model.Person;

import java.util.List;

public interface PersonRepositoryInterface {
    public void save(Person person);
    public List<Person> findAll();
}
