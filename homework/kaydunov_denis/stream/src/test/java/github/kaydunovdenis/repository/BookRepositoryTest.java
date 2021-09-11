package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class BookRepositoryTest {
    private final MockBookRepository mockBookRepository = new MockBookRepository();
    private final Map<String, Book> mockBooks = MockBookRepository.getMockBooks();

    @Before
    public void setUp() {
        mockBooks.clear();
    }

    @Test
    public void checkAddBooksInBookRepository() {
        Assert.assertEquals(0, mockBooks.size());
        mockBookRepository.testInitialRepository(mockBooks);
        int resultSize = mockBooks.size();
        Assert.assertEquals(7, resultSize);
        mockBookRepository.testInitialRepository(mockBooks);
        Assert.assertEquals(7, mockBooks.size());
    }
}
