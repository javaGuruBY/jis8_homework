package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Book;
import github.kaydunovdenis.repository.BookRepository;
import github.kaydunovdenis.repository.TestBookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryServiceTest {
    private TestBookRepository testBookRepository = new TestBookRepository();
    private LibraryService service = new LibraryService();

    @Before
    public void setUp() throws Exception {
        BookRepository.BOOKS.clear();
        //TODO как подменить на Mock?
        testBookRepository.testInitialRepository(BookRepository.BOOKS);
    }

    @Test
    public void findBooksWithPagesMoreThanTestPositive() {
        final int countPages = 200;
        List<Book> booksExpected = Arrays.asList(
                testBookRepository.book1,
                testBookRepository.book3,
                testBookRepository.book4,
                testBookRepository.book6
        );

        Assert.assertTrue(booksExpected.containsAll(service.findBooksWithPagesMoreThan(countPages)));
        Assert.assertTrue(service.findBooksWithPagesMoreThan(countPages).containsAll(booksExpected));
    }

    @Test
    public void findBooksWithPagesMoreThanTestNegative() {
        final int countPages = 200;
        List<Book> booksExpected = Arrays.asList(
                testBookRepository.book1,
                testBookRepository.book3,
                testBookRepository.book5,
                testBookRepository.book6
        );

        Assert.assertFalse(booksExpected.containsAll(service.findBooksWithPagesMoreThan(countPages)));
        Assert.assertFalse(service.findBooksWithPagesMoreThan(countPages).containsAll(booksExpected));
    }

    @Test
    public void findBookWithMaxCountPages() {
    }

    @Test
    public void findBookWithMinCountPages() {
    }

    @Test
    public void findBookWithOnlySingleAuthor() {
    }

    @Test
    public void sortBooksByNumberOfPage() {
    }

    @Test
    public void sortBooksByNumberOfTitle() {
    }

    @Test
    public void getListOfAllTitles() {
    }

    @Test
    public void printAlTitles() {
    }

    @Test
    public void getDistinctListAllAutors() {
    }
}