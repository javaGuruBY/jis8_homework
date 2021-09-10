package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

public class AuthorService {

    static public void addBook(Author author, Book book) {
        if (!hasBook(author, book)) {
            author.getBooks().add(book);
            BookService.addAuthor(author, book);
        }
    }

    static public boolean hasBook(Author author, Book book) {
        return author.getBooks().contains(book);
    }
}
