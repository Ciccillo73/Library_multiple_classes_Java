import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;


    @Before
    public void setUp(){
        book = new Book("The Longest Journey", "John Delaware", "Adventure");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Longest Journey", book.getTitle());
    }


}
