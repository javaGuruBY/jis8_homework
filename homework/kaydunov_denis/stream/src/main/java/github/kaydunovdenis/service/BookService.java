package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

public class BookService {

    public static void addAuthor(Author author, Book book) {
        if (!hasAuthor(author, book)) {
            book.getAuthors().add(author);
            AuthorService.addBook(author, book);
        }
    }

    public static boolean hasAuthor(Author author, Book book) {
        return book.getAuthors().contains(author);
    }
}
