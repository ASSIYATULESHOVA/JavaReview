package week05_Review.practice_tasks;

import java.util.Scanner;

public class CoffeeOrderApp {

    public static void main(String[] args) {

        double blackCoffeePrice = 2.5,
                lattePrice = 2.8,
                cappuccinoPrice = 3.5,

                totalPrice = 0;

        Scanner input = new Scanner(System.in);

        // Step 1:
        System.out.println("\t\tWelcome to the Coffee Order App!\n\nWould you like to order coffee? Yes/No");
        String answer = input.next().toLowerCase();

        if( !(answer.equals("yes") || answer.equals("no")) ){ // if the given answer is invalid (not yes and not no)
            System.err.println("Invalid answer, please try again later!");
            System.exit(1); // terminates the entire application
        }

        if(answer.equals("no")){
            System.out.println("Thanks for using our service!");
            return; // exits the main method
        }

        for (int i = 0; i < 1;) { // Possibly be an infinite loop

            // Step 2:
            System.out.println("Coffee Options:");
            System.out.println("\t1. Black Coffee - " + blackCoffeePrice);
            System.out.println("\t2. Latte - " + lattePrice);
            System.out.println("\t3. Cappuccino - " + cappuccinoPrice);

            // Step 3:
            System.out.println("Enter your choice:");
            int choice = input.nextInt();

            switch (choice) { // ordering the coffee & setting the total price
                case 1: // if user selected Black Coffee
                    System.out.println("Added Black Coffee to Your Order.");
                    totalPrice += blackCoffeePrice;
                    break;

                case 2: // if user selected Latte
                    System.out.println("Added Latte to Your Order.");
                    totalPrice += lattePrice;
                    break;

                case 3: // if user selected Cappuccino
                    System.out.println("Added Cappuccino to Your Order.");
                    totalPrice += cappuccinoPrice;
                    break;

                default: // If the user enters invalid choice
                    System.err.println("Invalid choice, please try again later!");
                    System.exit(1);

            }

            // Step 4:
            System.out.println("Would you like to add another order? Yes/No");
            answer = input.next().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) { // if the given answer is invalid (not yes and not no)
                System.err.println("Invalid answer, please try again later!");
                System.exit(1); // terminates the entire application
            }

            if (answer.equals("no")) { // if the user does not want to add another order
                System.out.println("Your total price is $" + totalPrice);
                //System.exit(0);
                i = 1; // to set the loop condition to false ===> loop will be terminated
            }

        }

        input.close();


    }

}
