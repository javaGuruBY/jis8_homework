package github.kaydunovdenis.bean;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BookTest {
    private Book book1;
    private Book book2;
    private Author author1;
    private Author author2;
    private Book book3;

    @Before
    public void setUp() {
        book1 = new Book("War", new ArrayList<>(), 659);
        book3 = new Book("War", new ArrayList<>(), 659);
        book2 = new Book("War and World", new ArrayList<>(), 159);
        author1 = new Author("Nik", (short) 45, new ArrayList<>());
        author2 = new Author("Artur", (short) 36, new ArrayList<>());
    }

    @Test
    public void testEquals() {
        assertEquals(book1, book1);
        assertEquals(book1, new Book("War", new ArrayList<>(), 659));
    }

    @Test
    public void testHashCode() {
        assertNotEquals(book1.hashCode(), book2.hashCode());
        assertEquals(book1.hashCode(), book1.hashCode());
        assertEquals(book1.hashCode(), book3.hashCode());
        book1.setTitle("Nikolas");
        assertNotEquals(book1.hashCode(), book3.hashCode());
    }

    @Test
    public void testToString() {
        String expected = "Book{title='War', authors=[], numberOfPages=659}";
        assertEquals(expected, book1.toString());
    }

    @Test
    public void setAuthors() {
        book1.setAuthors(Arrays.asList(author1, author2));
        assertEquals(2, book1.getAuthors().size());
    }


    @Test
    public void setNumberOfPages() {
        book1.setNumberOfPages(10);
        assertEquals(10, book1.getNumberOfPages());
    }
}
