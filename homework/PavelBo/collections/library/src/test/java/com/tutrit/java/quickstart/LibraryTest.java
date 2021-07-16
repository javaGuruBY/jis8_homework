package com.tutrit.java.quickstart;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book bookPuskin;
    Book bookPuskin2;
    Book bookPuskin3;
    Book bookChehov;
    Book bookTolstoy;
    Book bookTolstoy2;

    @Before
    public void setUp() throws Exception {
        library = new Library();
        bookPuskin = new Book("Pushkin", "pushka");
        bookPuskin2 = new Book("Pushkin", "duska");
        bookPuskin3 = new Book("Pushkin", "starushka");
        bookChehov = new Book("Chehov", "chehiy");
        bookTolstoy = new Book("Tolstoy", "tolstolobik");
        bookTolstoy2 = new Book("Tolstoy", "karas");
        library.addBook(bookPuskin);
        library.addBook(bookPuskin2);
        library.addBook(bookPuskin3);
        library.addBook(bookChehov);
        library.addBook(bookTolstoy);
        library.addBook(bookTolstoy2);
    }

    @Test
    public void addBook() {
        Assert.assertEquals(3,library.collectionBooks.size());
    }

    @Test
    public void removeBook() {
        library.removeBook(bookChehov);
        Assert.assertEquals(2, library.collectionBooks.size());
    }

    @Test
    public void findByAuthor() {
        ArrayList<String> extend= new ArrayList<>();
        extend.add("pushka");
        extend.add("duska");
        extend.add("starushka");
        Assert.assertEquals(extend, library.findByAuthor("Pushkin"));
    }

    @Test
    public void findByBook() {
        Assert.assertEquals(bookChehov, library.findByBook("chehiy"));
    }
}