package week12_Review.PracticeTasks;

public class InvalidProductNameException extends RuntimeException {

    public InvalidProductNameException(){
        super("Product name can not be set to null");
    }

    public InvalidProductNameException(String message){
        super(message);
    }

}
