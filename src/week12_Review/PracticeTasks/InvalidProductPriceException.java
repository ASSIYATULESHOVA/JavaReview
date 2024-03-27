package week12_Review.PracticeTasks;

public class InvalidProductPriceException extends RuntimeException{
    public InvalidProductPriceException(){
        super("Product's price can not set to negative or zero.");
    }
    public InvalidProductPriceException(String message){
        super(message);
    }
}
