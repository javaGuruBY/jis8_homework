package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        initialValues();
    }

    @Test
    public void addBook() {
        library.addBook(bookChehov);
        assertEquals(3,library.authorToBookNamesMap.size());
    }

    @Test
    public void removeBook() {
        assertTrue(library.removeBook(bookChehov));
    }

    @Test
    public void findByAuthor() {
        ArrayList<Book> extend= new ArrayList<>();
        extend.add(bookPuskin);
        extend.add(bookPuskin2);
        extend.add(bookPuskin3);
        assertEquals(extend, library.findByAuthor("Pushkin"));
    }

    @Test
    public void findByBook() {
        assertEquals(bookChehov, library.findByBook("chehiy"));
    }

    private void initialValues() {
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
}
