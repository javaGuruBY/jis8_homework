package com.tutrit.java.quickstart.controller;

import com.tutrit.java.quickstart.frameworks.MyControllerInterface;
import com.tutrit.java.quickstart.model.Person;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MyController implements MyControllerInterface {
    PersonRepositoryInterface personRepository;
    PersonPresenterInterface personPresenter;

    public void makePerson(String[] args) {
        personRepository.save(new Person(args[0], args[1]));
        List<Person> people = personRepository.findAll();
        personPresenter.showAllPerson(people);
    }
}
