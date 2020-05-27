import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> libraryStock;

    public Borrower(String borrowerName) {
        this.name = borrowerName;
        this.libraryStock = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int bookCount() {
        return this.libraryStock.size();
    }

    public void addBook(Book book) {
        this.libraryStock.add(book);
    }

}
