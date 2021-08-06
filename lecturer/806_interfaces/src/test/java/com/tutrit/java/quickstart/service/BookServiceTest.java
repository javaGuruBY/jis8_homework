package com.tutrit.java.quickstart.service;

import static org.junit.Assert.*;

import com.tutrit.java.quickstart.bean.Appartments;
import com.tutrit.java.quickstart.bean.Book;
import com.tutrit.java.quickstart.bean.City;
import com.tutrit.java.quickstart.bean.Closed;
import com.tutrit.java.quickstart.bean.Country;
import com.tutrit.java.quickstart.bean.House;
import com.tutrit.java.quickstart.bean.Room;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookServiceTest {

    BookService bookService;
    BookServiceInterface goodBookService;

    @Before
    public void setUp() {
        bookService =
                new BookService(
                        new Country(
                                new City(
                                        new House(
                                                new Appartments(
                                                        new Room(
                                                                new Closed(makeBooks())))))));
        goodBookService = bookService;
    }

    @Test
    public void codeSmells() {
        Book book = bookService
                .getCountry()
                .getCity()
                .getHouse()
                .getAppartments()
                .getRoom()
                .getClosed()
                .findBook("Statut");

        Assert.assertEquals(new Book("Statut"), book);
    }

    @Test
    public void facade() {
        Book book = goodBookService.findBookInHouse("Statut");
        Assert.assertEquals(new Book("Statut"), book);
    }

    public List<Book> makeBooks() {
        return List.of(
                new Book("Statut"),
                new Book("Azbuka"),
                new Book("Robert Martin"));
    }
}