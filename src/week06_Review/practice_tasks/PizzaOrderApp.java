package week06_Review.practice_tasks;

import java.util.Scanner;

public class PizzaOrderApp {


    static Scanner input = new Scanner(System.in);  // Global Variable

    public static void main(String[] args) {

        // Step1:
        System.out.println("\t\tWelcome to Cydeo Pizza House");
        System.out.println("\nWould you like to order a pizza?Yes/No");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) { // while the answer is invalid
            System.err.println("Invalid entry, please enter 'yes' or 'no':");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("no")) { // if the answer is no
            System.out.println("Thanks for using our service!");
            return;
        }

        // Step2:
        System.out.println("Enter the size of the pizza (small, medium, or large):");
        String size = input.next().toLowerCase();

        while( !(size.equals("small") || size.equals("medium") || size.equals("large")) ){
            System.err.println("Invalid entry, please enter 'small' or 'medium' or 'large':");
            size = input.next().toLowerCase();
        }


        // Step 3:
        System.out.println("Enter the number of cheese toppings:");
        int cheeseTopping = input.nextInt();
        cheeseTopping = verifyToppings(cheeseTopping, "cheese");

        System.out.println("Enter the number of peperoni toppings:");
        int peperoniTopping = input.nextInt();
        peperoniTopping = verifyToppings(peperoniTopping, "peperoni");


        // Step 4:
        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        while(quantity <= 0){
            System.err.println("Invalid entry, please re-enter the number of quantity:");
            quantity = input.nextInt();
        }


        // Step 5:
        Pizza order = new Pizza();
        order.setInfo(size, cheeseTopping, peperoniTopping, quantity);

        System.out.println("Your current price is $" + order.calcCost());

        /*
        Step 6:
            Ask the user if they want to add another order

            If yes ---> repeat starting step #2
            If no  ---> Display the total price

            If invalid --- > re-enter

         */



    }


    public static int verifyToppings(int num, String typeOfTopping){
        while ( num < 0){
            System.err.println("Invalid entry, please re-enter the number of " + typeOfTopping+ " toppings:");
            num = input.nextInt();
        }
        return num;
    }


}

