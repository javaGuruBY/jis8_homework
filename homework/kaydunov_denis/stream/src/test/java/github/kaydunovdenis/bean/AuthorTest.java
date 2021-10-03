package github.kaydunovdenis.bean;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class AuthorTest {
    private Author author1 = new Author("Nik", (short) 45, new ArrayList<>());
    private Author author2 = new Author("Nik", (short) 45, new ArrayList<>());
    public Book book7 = new Book("One, one, one", Collections.singletonList(author1), 132);

    @Test
    public void getName() {
        assertEquals("Nik", author1.getName());
    }

    @Test
    public void setName() {
        author1.setName("Nikolas");
        assertEquals("Nikolas", author1.getName());
    }

    @Test
    public void getAge() {
        assertEquals(45, author1.getAge());
    }

    @Test
    public void setAge() {
        author1.setAge((short) 50);
        assertEquals(50, author1.getAge());

    }

    @Test
    public void getBooks() {
        assertEquals(0, author1.getBooks().size());
    }

    @Test
    public void setBooks() {
        author1.setBooks(List.of(book7));
        assertEquals(1, author1.getBooks().size());
    }

    @Test
    public void testEquals() {
        assertEquals(author1, author1);
        assertEquals(author1, new Author("Nik", (short) 45, new ArrayList<>()));
    }

    @Test
    public void testHashCode() {
        assertEquals(author1.hashCode(), author2.hashCode());
        assertEquals(author1.hashCode(), author1.hashCode());
        author1.setName("Nikolas");
        assertNotEquals(author1.hashCode(), author2.hashCode());
    }

    @Test
    public void testToString() {
        String expected = "Author{name='Nik', age=45, books=[]}";
        assertEquals(expected, author1.toString());
    }
}
