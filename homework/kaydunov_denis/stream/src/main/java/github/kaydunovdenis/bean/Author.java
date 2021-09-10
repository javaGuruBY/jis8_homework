package github.kaydunovdenis.bean;

import com.sun.istack.internal.NotNull;
import github.kaydunovdenis.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Author {
    private String name;
    private short age;
    private List<Book> books;

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
        books = new ArrayList<>();
    }

    public Author(String name, short age, @NotNull List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
        //books.stream().forEach(book -> BookRepository.BOOKS.put(book.getTitle(), book));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age &&
                Objects.equals(name, author.name) &&
                Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, books);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
