package github.kaydunovdenis.service;

import github.kaydunovdenis.bean.Author;
import github.kaydunovdenis.bean.Book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static github.kaydunovdenis.repository.BookRepository.BOOKS;

public class LibraryService {

    /**
     * @param countPages of book
     * @return I. find Books With Pages More Than countPages
     */
    public List<Book> findBooksWithPagesMoreThan(int countPages) {
        return BOOKS.values().stream()
                .filter(book -> book.getNumberOfPages() > countPages)
                .collect(Collectors.toList());
    }

    /**
     * @return II. find the books with max number of pages;
     */
    public List<Book> findBooksWithMaxCountPages() {
        int maxPages = findMaxCountPagesAmongAllBooks();
        return BOOKS.values().stream()
                .filter(book -> book.getNumberOfPages() == maxPages)
                .collect(Collectors.toList());
    }

    private int findMaxCountPagesAmongAllBooks() {
        return BOOKS.values().stream()
                .map(Book::getNumberOfPages)
                .max(Integer::compareTo)
                .orElse(0);
    }

    /**
     * @return II. find the books with min number of pages;
     */
    public List<Book> findBooksWithMinCountPages() {
        int minPages = findMinCountPagesAmongAllBooks();
        return BOOKS.values().stream()
                .filter(book -> book.getNumberOfPages() == minPages)
                .collect(Collectors.toList());
    }

    private int findMinCountPagesAmongAllBooks() {
        return BOOKS.values().stream()
                .min(Comparator.comparing(Book::getNumberOfPages))
                .get()
                .getNumberOfPages();
    }

    /**
     * @return III. filter books with only single author;
     */
    public List<Book> findBookWithOnlySingleAuthor() {
        final int countAuthors = 1;
        return BOOKS.values().stream()
                .filter(book -> book.getAuthors().size() == countAuthors)
                .collect(Collectors.toList());
    }

    /**
     * @return IV. sort the books by number of pages;
     */
    public List<Book> sortBooksByNumberOfPage() {
        return BOOKS.values().stream()
                .sorted(Comparator.comparing(Book::getNumberOfPages))
                .collect(Collectors.toList());
    }

    /**
     * @return IV. sort the books by number of title;
     */
    public List<Book> sortBooksByNumberOfTitle() {
        return BOOKS.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * @return V. get list of all titles;
     */
    public List<String> getListOfAllTitles() {
        return BOOKS.values().stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    /**
     * VI. print them using forEach method;
     */
    public void printAlTitles() {
        getListOfAllTitles().forEach(System.out::println);
    }

    /**
     * @return VII. get distinct list of all authors
     */
    public List<Author> getDistinctListAllAuthors() {
        return BOOKS.values().stream()
                .flatMap(book -> book.getAuthors().stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
