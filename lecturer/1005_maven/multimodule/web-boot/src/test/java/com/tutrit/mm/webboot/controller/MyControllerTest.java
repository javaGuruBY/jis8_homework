package com.tutrit.mm.webboot.controller;

import com.tutrit.mm.bean.Person;
import com.tutrit.mm.dao.gateway.PersonRepositoryInterface;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ComponentScan({"com.tutrit.mm.dao.gateway"})
class MyControllerTest {

    @MockBean
    PersonRepositoryInterface personRepositoryMock;
    @Autowired
    MyController myController;

    @Test
    void makePerson() {
        Mockito.when(personRepositoryMock.findAll()).thenReturn(List.of(
                new Person("max", "23", LocalDateTime.now()),
                new Person("vlad", "43", LocalDateTime.now())
        ));
        myController.makePerson("max", "35");
    }
}