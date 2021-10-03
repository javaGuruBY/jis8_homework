package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class BookServiceTest {

    @Test
    public void addAuthor() {
        Author author = new Author("Nik", (short) 45, new ArrayList<>());
        Book book = new Book("One, one, one", new ArrayList<>(), 132);
        Assert.assertFalse(BookService.hasAuthor(author, book));

        BookService.addAuthor(author, book);
        Assert.assertTrue(BookService.hasAuthor(author, book));

        Author newAuthor = new Author("Nigerian", (short) 34, new ArrayList<>());
        Assert.assertFalse(BookService.hasAuthor(newAuthor, book));
    }

    @Test
    public void hasAuthor() {
        Author author = new Author("Nik", (short) 45, new ArrayList<>());
        Book book = new Book("One, one, one", new ArrayList<>(), 132);
        Assert.assertFalse(BookService.hasAuthor(author, book));

        book.getAuthors().add(author);
        Assert.assertTrue(BookService.hasAuthor(author, book));

        Author newAuthor = new Author("Nigerian", (short) 34, new ArrayList<>());
        Assert.assertFalse(BookService.hasAuthor(newAuthor, book));
    }
}
