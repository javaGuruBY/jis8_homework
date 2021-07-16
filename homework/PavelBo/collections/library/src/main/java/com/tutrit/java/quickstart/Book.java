package com.tutrit.java.quickstart;

import java.util.Objects;

public class Book {

    private String authorBook;
    private String nameBook;

    public Book(String authorBook, String nameBook){
        this.authorBook = authorBook;
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorBook='" + authorBook + '\'' +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getAuthorBook().equals(book.getAuthorBook()) && getNameBook().equals(book.getNameBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorBook(), getNameBook());
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }
}
