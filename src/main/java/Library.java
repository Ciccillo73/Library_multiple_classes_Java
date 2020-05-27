import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<String, Integer> genreHashMap;
    private ArrayList<Book> libraryStock;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.libraryStock = new ArrayList<>();
        this.genreHashMap = new HashMap<>();
    }

//GETTERS

    public ArrayList<Book> getLibraryStock(){
        return this.libraryStock;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean hasCapacity(){
        return this.capacity > this.libraryStock.size();
    }

    public int libraryStockCount(){
        return this.libraryStock.size();
    }


    public void addBook(Book book) {
        if(hasCapacity() ){
            this.libraryStock.add(book);
//            updateHash(book)
        }

    }

    public void updateHash(Book book){
        String genre = book.getGenre();
        if(this.genreHashMap.containsKey(genre)){
            int number = genreHashMap.get(genre);
            number ++;
            this.genreHashMap.put(genre, number);
        }else{
            this.genreHashMap.put(genre, 1);
        }
    }
}
