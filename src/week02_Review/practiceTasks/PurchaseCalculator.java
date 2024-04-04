package week02_Review.practiceTasks;

public class PurchaseCalculator {


    public static void main(String[] args) {

        double salesTaxRate = 8;
        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;

        double totalCostBeforeTax = unitPrice * quantity;
        double salesTax = totalCostBeforeTax * salesTaxRate /100;
        double grandTotal = totalCostBeforeTax + salesTax;

        System.out.println("Item name: " +itemName);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Quantity: " + quantity+"\n");
        System.out.println("Total cost before tax: $" +totalCostBeforeTax);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("=================================");
        System.out.println("Grand total: $" + grandTotal );


    }

}
