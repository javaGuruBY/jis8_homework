package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

public class BookService {
    private AuthorService authorService;

    public BookService(AuthorService authorService) {
        this.authorService = authorService;
    }

    public void addAuthor(Author author, Book book) {
        if (!containsAutor(author, book)) {
            book.getAuthors().add(author);
        }
        authorService.addBook(author, book);
    }

    public boolean containsAutor(Author author, Book book) {
        return book.getAuthors().contains(author);
    }


}
