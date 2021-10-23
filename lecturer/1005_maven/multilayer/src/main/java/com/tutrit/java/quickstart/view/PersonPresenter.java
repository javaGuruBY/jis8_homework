package com.tutrit.java.quickstart.view;

import com.tutrit.java.quickstart.controller.PersonPresenterInterface;
import com.tutrit.java.quickstart.model.Person;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PersonPresenter implements PersonPresenterInterface {

    public void showAllPerson(List<Person> people) {
        people.forEach(System.out::println);
    }
}
