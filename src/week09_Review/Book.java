package week09_Review;

public class Book {
    public String title, author;
    public int publicationYear;
    public String genre;
    public int price;


    public Book(String title){
        this.title = title;
        author = "Unknown";
        genre = "Unknown";
        publicationYear = 2000;
        price = 5;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        publicationYear = 2000;
        price = 5;

    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        genre = "Unknown";
        publicationYear = 2000;
        price = 5;
    }

    public Book(String title, String author, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        price = 5;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }



}
