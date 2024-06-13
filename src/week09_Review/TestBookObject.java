package week09_Review;

public class TestBookObject {
    public static void main(String[] args) {

        Book book1 = new Book("War and Piece","Lev Tolstoy",1956,"Criminal");

        Book book2 = new Book("Hunter","Joe Be",1999);

        Book book3 = new Book("Api","Amazon",2024);
        Book book4 = new Book("Secret","Amazon",1999);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);


    }
}
