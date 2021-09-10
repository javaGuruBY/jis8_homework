package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BookServiceTest {

    @Test
    public void addAuthor() {
        Author author = new Author("Nik", (short) 45, new ArrayList<>());
        Book book = new Book("One, one, one", Arrays.asList(author), 132);
        Assert.assertFalse(BookService.hasAutor(author, book));

        BookService.addAuthor(author, book);
        Assert.assertTrue(BookService.hasAutor(author, book));

        Author newAutor = new Author("Nigan", (short) 34, new ArrayList<>());
        Assert.assertFalse(BookService.hasAutor(newAutor, book));
    }

    @Test
    public void hasAutor() {
        Author author = new Author("Nik", (short) 45, new ArrayList<>());
        Book book = new Book("One, one, one", Arrays.asList(author), 132);
        Assert.assertFalse(BookService.hasAutor(author, book));

        book.getAuthors().add(author);
        Assert.assertTrue(BookService.hasAutor(author, book));

        Author newAutor = new Author("Nigan", (short) 34, new ArrayList<>());
        Assert.assertFalse(BookService.hasAutor(newAutor, book));
    }
}