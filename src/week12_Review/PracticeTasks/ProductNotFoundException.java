package week12_Review.PracticeTasks;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(){
       super("The product does no exist");
    }
    public ProductNotFoundException(String message){
     super(message);
    }
}
