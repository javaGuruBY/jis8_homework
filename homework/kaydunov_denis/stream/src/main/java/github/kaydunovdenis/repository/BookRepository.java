package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    protected static final Map<String, Book> BOOKS = new HashMap<>();

    private BookRepository() {
    }
}
