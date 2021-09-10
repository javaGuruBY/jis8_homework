package github.kaydunovdenis.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookRepositoryTest {
    private TestBookRepository testBookRepository = new TestBookRepository();
    @Before
    public void setUp() throws Exception {
        BookRepository.BOOKS.clear();
    }

    @Test
    public void ckeckAddBooksInBookRepository() {
        //TODO как здесь использовать Mock, чтобы реальный BOOKS не задействовать?
        Assert.assertEquals(0, BookRepository.BOOKS.size());
        testBookRepository.testInitialRepository(BookRepository.BOOKS);
        int resultSize = BookRepository.BOOKS.size();
        Assert.assertEquals(7, resultSize);
        testBookRepository.testInitialRepository(BookRepository.BOOKS);
        Assert.assertEquals(7, BookRepository.BOOKS.size());
    }
}
