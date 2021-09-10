package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Book;
import github.kaydunovdenis.repository.BookRepository;
import github.kaydunovdenis.repository.TestBookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LibraryServiceTest {
    private TestBookRepository testBookRepository = new TestBookRepository();
    private LibraryService service = new LibraryService();
    private List<Book> booksExpected;
    private List<Book> booksResult;

    @Before
    public void setUp() throws Exception {
        BookRepository.BOOKS.clear();
        //TODO как подменить на Mock?
        testBookRepository.testInitialRepository(BookRepository.BOOKS);
    }

    @Test
    public void findBooksWithPagesMoreThanTestPositive() {
        final int countPages = 200;
        booksExpected = Arrays.asList(
                testBookRepository.book1,
                testBookRepository.book3,
                testBookRepository.book4,
                testBookRepository.book6
        );
        booksResult = service.findBooksWithPagesMoreThan(countPages);

        Assert.assertTrue(booksExpected.containsAll(booksResult));
        Assert.assertTrue(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithPagesMoreThanTestNegative() {
        final int countPages = 200;
        booksExpected = Arrays.asList(
                testBookRepository.book1,
                testBookRepository.book3,
                testBookRepository.book5,
                testBookRepository.book6
        );
        booksResult = service.findBooksWithPagesMoreThan(countPages);

        Assert.assertFalse(booksExpected.containsAll(booksResult));
        Assert.assertFalse(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithMaxCountPages() {
        booksExpected = Arrays.asList(
                testBookRepository.book1
        );

        booksResult = service.findBooksWithMaxCountPages();

        System.out.println(booksResult);
        System.out.println(booksExpected);

        Assert.assertFalse(booksExpected.containsAll(booksResult));
        Assert.assertFalse(booksResult.containsAll(booksExpected));
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