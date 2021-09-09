package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

public class AuthorService {
    BookService bookService;

    public AuthorService(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(Author author, Book book) {
        if (!containsBook(author, book)) {
            author.getBooks().add(book);
        }
        bookService.addAuthor(author, book);
    }

    public boolean containsBook(Author author, Book book) {
        return author.getBooks().contains(book);
    }
}
