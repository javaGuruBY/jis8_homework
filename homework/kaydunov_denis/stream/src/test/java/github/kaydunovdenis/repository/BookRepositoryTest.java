package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;
import org.junit.Before;
import org.mockito.Mock;

import java.util.ArrayList;

public class BookRepositoryTest {

    @Mock
    BookRepository bookRepository;

    @Before
    public void setUp() throws Exception {

    }

    public void initialRepository() {

        Author author1 = new Author("Nik", (short) 45, new ArrayList<>());
        Book book1 = new Book("War", new ArrayList(author1, new Author("Ivan Kard", (short) 43)));


    }

}