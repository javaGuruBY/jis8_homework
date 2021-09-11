package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;
import github.kaydunovdenis.repository.MockBookRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class LibraryServiceTest {
    private final MockBookRepository mockBookRepository = new MockBookRepository();
    private final Map<String, Book> mockBooks = new HashMap<>();
    private LibraryService service;
    private List<Book> booksExpected = new ArrayList<>();
    private List<Book> booksResult = new ArrayList<>();

    @Before
    public void setUp() {
        mockBookRepository.testInitialRepository(mockBooks);
        service = new LibraryService(mockBooks);
    }

    @Test
    public void findBooksWithPagesMoreThanTestPositive() {
        final int countPages = 200;
        booksExpected.add(mockBookRepository.book1);
        booksExpected.add(mockBookRepository.book3);
        booksExpected.add(mockBookRepository.book4);
        booksExpected.add(mockBookRepository.book6);

        booksResult = service.findBooksWithPagesMoreThan(countPages);
        assertTrue(booksExpected.containsAll(booksResult));
        assertTrue(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithPagesMoreThanTestNegative() {
        final int countPages = 200;
        booksExpected.add(mockBookRepository.book1);
        booksExpected.add(mockBookRepository.book3);
        booksExpected.add(mockBookRepository.book5);
        booksExpected.add(mockBookRepository.book6);
        booksResult = service.findBooksWithPagesMoreThan(countPages);
        assertNotEquals(booksExpected, booksResult);

        booksExpected.add(mockBookRepository.book4);
        assertTrue(booksExpected.containsAll(booksResult));
        assertFalse(booksResult.containsAll(booksExpected));
    }

    @Test
    public void findBooksWithMaxCountPages() {
        booksExpected = Collections.singletonList(
                mockBookRepository.book1
        );
        booksResult = service.findBooksWithMaxCountPages();
        assertEquals(booksExpected, booksResult);
    }

    @Test
    public void findBooksWithMinCountPages() {
        booksExpected = Collections.singletonList(
                mockBookRepository.book7
        );
        booksResult = service.findBooksWithMinCountPages();
        assertEquals(booksExpected, booksResult);
    }

    @Test
    public void findBookWithOnlySingleAuthor() {
        booksExpected.add(mockBookRepository.book4);
        booksExpected.add(mockBookRepository.book5);
        booksExpected.add(mockBookRepository.book6);
        booksResult = service.findBookWithOnlySingleAuthor();

        assertTrue(booksResult.containsAll(booksExpected));
        assertFalse(booksExpected.containsAll(booksResult));

        booksExpected.add(mockBookRepository.book7);
        assertTrue(booksResult.containsAll(booksExpected));
        assertTrue(booksExpected.containsAll(booksResult));
    }

    @Test
    public void sortBooksByNumberOfPage() {
        List<Book> expected = List.of(
                mockBookRepository.book7,
                mockBookRepository.book2,
                mockBookRepository.book5,
                mockBookRepository.book3,
                mockBookRepository.book4,
                mockBookRepository.book6,
                mockBookRepository.book1
        );

        booksResult = service.sortBooksByNumberOfPage();
        assertEquals(expected, booksResult);
    }

    @Test
    public void sortBooksByNumberOfTitle() {
        booksExpected = List.of(
                mockBookRepository.book5,
                mockBookRepository.book6,
                mockBookRepository.book4,
                mockBookRepository.book7,
                mockBookRepository.book1,
                mockBookRepository.book2,
                mockBookRepository.book3
        );

        booksResult = service.sortBooksByTitle();
        assertEquals(booksExpected, booksResult);
    }

    @Test
    public void getListOfAllTitles() {
        List<String> expected = List.of("War and World",
                "Future love",
                "One, one, one",
                "Warframe",
                "War",
                "One and one",
                "One war and one love");
        assertEquals(expected, service.getListOfAllTitles());
    }

    @Test
    public void printAlTitles() {
    }

    @Test
    public void getDistinctListAllAuthors() {
        List<Author> expected = List.of(
                new Author("Nik", (short) 45, new ArrayList<>()),
                new Author("Artur", (short) 36, new ArrayList<>()),
                new Author("Artur Nero", (short) 37, new ArrayList<>()));
        assertEquals(expected, service.getDistinctListAllAuthors());
    }

    @Ignore
    @Test
    public void testFindBookWithOnlySingleAuthorUsedByParallelStream() {
        //I dont know how write tests for parallel thread.
    }
}
