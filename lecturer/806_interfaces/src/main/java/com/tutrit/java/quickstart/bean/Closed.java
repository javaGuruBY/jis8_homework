package com.tutrit.java.quickstart.bean;

import java.util.List;

public class Closed {

    List<Book> books;

    public Closed(List<Book> books) {
        this.books = books;
    }

    public Book findBook(String string) {
        return books.stream()
                .filter(book -> book.name.equals(string))
                .findFirst()
                .orElse(new Book(""));
    }
}
