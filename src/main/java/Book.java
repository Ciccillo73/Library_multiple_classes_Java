public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre ){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

//GETTERS
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }

//SETTERS
    public setTitle(String newTitle){
        this.title = newTitle;
    }

    public setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public setGenre(String newGenre){
        this.genre = newGenre;
    }

}
