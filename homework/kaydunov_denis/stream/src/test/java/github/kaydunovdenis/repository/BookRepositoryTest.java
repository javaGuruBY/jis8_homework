package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;
import org.junit.Before;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;

public class BookRepositoryTest {

    @Mock
    BookRepository bookRepository;

    @Before
    public void setUp() throws Exception {

    }

    public void initialRepository() {


        Author author1 = new Author("Nik", (short) 45, new ArrayList<>());
        Author author2 = new Author("Artur", (short) 36, new ArrayList<>());
        Author author3 = new Author("Artur Nero", (short) 37, new ArrayList<>());
        Book book1 = new Book("War", Arrays.asList(author1, author2),659);
        Book book2 = new Book("War and World", Arrays.asList(author1, author2),159);
        Book book3 = new Book("Warface", Arrays.asList(author1, author2, author3),234);
        Book book4 = new Book("One war and one love", Arrays.asList(author3),321);
        Book book5 = new Book("Futue love", Arrays.asList(author3),192);
        Book book6 = new Book("One and one", Arrays.asList(author2),422);
        Book book7 = new Book("One, one, one", Arrays.asList(author1),132);
    }

}