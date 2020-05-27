import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Borrower borrower;

    @Before
    public void setUp(){
        this.book = new Book("The Journey", "John Delon", "Adventure");
        this.borrower = new Borrower("Matt");
    }

    @Test
    public void canCountBook(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }
}
