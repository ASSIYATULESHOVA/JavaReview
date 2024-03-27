package week12_Review.PracticeTasks;

public class Test {
    public static void main(String[] args) {
        Product[] products = { new Product("Notebook",3.5),
                new Product("TV",2000), new Product("Eraser",1.5),new Product("Pencil",2.5)};
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(products);
        cart.displayCart();
        System.out.println("===========================================");

    }
}
