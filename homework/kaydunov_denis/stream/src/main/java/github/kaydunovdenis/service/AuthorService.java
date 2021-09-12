package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

public class AuthorService {
    private AuthorService() {
    }

    public static void addBook(Author author, Book book) {
        if (!hasBook(author, book)) {
            author.getBooks().add(book);
            BookService.addAuthor(author, book);
        }
    }

    public static boolean hasBook(Author author, Book book) {
        return author.getBooks().contains(book);
    }
}
