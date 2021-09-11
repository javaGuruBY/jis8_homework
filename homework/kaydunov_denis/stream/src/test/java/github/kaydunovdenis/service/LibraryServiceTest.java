package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Book;
import github.kaydunovdenis.repository.MockBookRepository;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Log4j
public class LibraryServiceTest {
    private final MockBookRepository mockBookRepository = new MockBookRepository();
    private final Map<String, Book> mockBooks = MockBookRepository.getMockBooks();
    private final LibraryService service = new LibraryService();
    private List<Book> booksExpected;
    private List<Book> booksResult;

    @Before
    public void setUp() {
        mockBooks.clear();
        mockBookRepository.testInitialRepository(mockBooks);
    }

    @Test
    public void findBooksWithPagesMoreThanTestPositive() {
        final int countPages = 200;
        booksExpected = Arrays.asList(
                mockBookRepository.book1,
                mockBookRepository.book3,
                mockBookRepository.book4,
                mockBookRepository.book6
        );
        booksResult = service.findBooksWithPagesMoreThan(countPages);

        Assert.assertTrue(booksExpected.containsAll(booksResult));
        Assert.assertTrue(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithPagesMoreThanTestNegative() {
        final int countPages = 200;
        booksExpected = Arrays.asList(
                mockBookRepository.book1,
                mockBookRepository.book3,
                mockBookRepository.book5,
                mockBookRepository.book6
        );
        booksResult = service.findBooksWithPagesMoreThan(countPages);

        Assert.assertFalse(booksExpected.containsAll(booksResult));
        Assert.assertFalse(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithMaxCountPages() {
        booksExpected = Collections.singletonList(
                mockBookRepository.book1
        );

        booksResult = service.findBooksWithMaxCountPages();

        System.out.println(booksResult);
        System.out.println(booksExpected);

        Assert.assertFalse(booksExpected.containsAll(booksResult));
        Assert.assertFalse(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithMinCountPages() {
        booksExpected = Collections.singletonList(
                mockBookRepository.book7
        );

        booksResult = service.findBooksWithMaxCountPages();


        log.info("booksExpected:{}", booksExpected.toString());
        Assert.assertTrue(booksExpected.equals(booksResult));

        //Assert.assertFalse(booksResult.containsAll(booksExpected));
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
    public void getDistinctListAllAuthors() {
    }
}
