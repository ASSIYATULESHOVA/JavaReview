package week12_Review.PracticeTasks;

public class TestClass {
    public static void main(String[] args) {

   ProductNotFoundException exception1 = new ProductNotFoundException();
      //throw new ProductNotFoundException();
  // throw new ProductNotFoundException("The product you are looking for has been removed from the cart.")

      //  throw new InvalidProductNameException();

      //  throw new InvalidProductNameException("This product name should not contain digits.");

     //   throw new InvalidProductPriceException();

      //  throw new InvalidProductPriceException("The product's price must be less than 100 dollars");

        Product product1, product2, product3;
        product1 = new Product("TV",2000);
       /* if(product1.getName().equals("TV")){
            throw new InvalidProductPriceException("The maximum price of TV is 5000, but given: "+product1.getPrice());
        }   */

        product2 = new Product("LapTop", 2000);
        System.out.println(product1);
        System.out.println(product2);


    }
}
