package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;
import github.kaydunovdenis.repository.TestBookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AuthorServiceTest {

    @Test
    public void addBook() {
        Author author = new Author("Nik", (short) 45, new ArrayList<>());
        Book book = new Book("One, one, one", new ArrayList<>(), 132);
        Assert.assertFalse(AuthorService.hasBook(author, book));

        AuthorService.addBook(author, book);
        Assert.assertTrue(AuthorService.hasBook(author, book));

        Assert.assertTrue(book.getAuthors().contains(author));
    }

    @Test
    public void hasBook() {
        Author author = new Author("Nik", (short) 45, new ArrayList<>());
        Book book = new Book("One, one, one", Arrays.asList(author), 132);
        Assert.assertFalse(AuthorService.hasBook(author, book));

        author.getBooks().add(book);
        Assert.assertTrue(AuthorService.hasBook(author, book));

        Book newBook = new Book("Empty", new ArrayList<>(), 222);
        Assert.assertFalse(AuthorService.hasBook(author, newBook));
    }
}
