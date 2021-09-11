package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

import java.util.*;

public class MockBookRepository {
    public static final Map<String, Book> MOCK_BOOKS = new HashMap<>();

    public Author author1 = new Author("Nik", (short) 45, new ArrayList<>());
    public Author author2 = new Author("Artur", (short) 36, new ArrayList<>());
    public Author author3 = new Author("Artur Nero", (short) 37, new ArrayList<>());

    public Book book1 = new Book("War", Arrays.asList(author1, author2), 659);
    public Book book2 = new Book("War and World", Arrays.asList(author1, author2), 159);
    public Book book3 = new Book("Warframe", Arrays.asList(author1, author2, author3), 234);
    public Book book4 = new Book("One war and one love", Collections.singletonList(author3), 321);
    public Book book5 = new Book("Future love", Collections.singletonList(author3), 192);
    public Book book6 = new Book("One and one", Collections.singletonList(author2), 422);
    public Book book7 = new Book("One, one, one", Collections.singletonList(author1), 132);


    public void testInitialRepository(Map<String, Book> books) {
        books.put(book1.getTitle(), book1);
        books.put(book2.getTitle(), book2);
        books.put(book3.getTitle(), book3);
        books.put(book4.getTitle(), book4);
        books.put(book5.getTitle(), book5);
        books.put(book6.getTitle(), book6);
        books.put(book7.getTitle(), book7);
    }

    public static Map<String, Book> getMockBooks() {
        return MOCK_BOOKS;
    }
}
