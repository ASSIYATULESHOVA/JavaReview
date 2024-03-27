package week12_Review.PracticeTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    public ShoppingCart(){
        products = new LinkedList<>();

    }
    public List<Product> getProducts() {
        return products;
    }
    public void addToCart(Product product){
        if(product == null){
            throw new NullPointerException("Null can not be added to the shopping cart.");
        }
        products.add(product);
    }
    public void addToCart(Product[] products){
        for (Product eachProduct : products) {
           addToCart(eachProduct);
           /* if(eachProduct == null){
                continue;
            }
            this.products.add(eachProduct);

            */
        }
    }
    public void remove(String name){
        boolean containsTheProduct = false;
        for (Product eachProduct : products) {
            if(eachProduct.getName().equalsIgnoreCase(name)){
               containsTheProduct = true;
            }
        }
       if(!containsTheProduct){
           throw new ProductNotFoundException();
       }else{
           products.removeIf( p -> p.getName().equalsIgnoreCase(name));
       }
    }

    public void displayCart(){
        int count = 1;
        for (Product eachProduct : products) {
            System.out.println("Product "+count++ +":");
            System.out.println("\t"+ eachProduct.getName()+ " - $"+eachProduct.getPrice());
            System.out.println("-----------------------------------------------");
        }
    }
}
