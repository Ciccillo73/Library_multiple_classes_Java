import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;

    private Library library;
    private Library library2;

    private Borrower borrower;


    @Before
    public void setUp(){
        this.book1 = new Book("The Journey", "John Delon", "Adventure");
        this = new Book("Afrika", "Math Phillip", "Adventure");

        this.borrower = new Borrower("Matt");
        this.library = new Library(1);
        this.library2 = new Library(3);


    }

    @Test
    public void hasCapacity(){
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void canAddBookIfPossibile(){
        library.addBook(book1);
        assertEquals(1,library.libraryStockCount());
    }

    @Test
    public void cantAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.libraryStockCount());
    }



}
