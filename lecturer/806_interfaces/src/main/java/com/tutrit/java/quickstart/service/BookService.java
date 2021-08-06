package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Book;
import com.tutrit.java.quickstart.bean.Country;

public class BookService implements BookServiceInterface {

    Country country;

    public BookService(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public Book findBookInHouse(String book) {
        return country
                .getCity()
                .getHouse()
                .getAppartments()
                .getRoom()
                .getClosed()
                .findBook(book);
    }
}
