package week04_Review;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        String str = new String("Java");

        Scanner input = new Scanner(System.in);  //

        System.out.println("Enter an integer:");

        int num = input.nextInt(); // 1 2 3

        System.out.println("You have entered: " + num);

        System.out.println("Enter a decimal number:");

        double num2 = input.nextDouble(); // 2 . 5

        System.out.println("You have entered: " + num2);

        System.out.println("Enter a single character:");

        char ch = input.next().charAt(0); // A

        System.out.println("You have entered: " + ch);

        System.out.println("Enter a single word:");

        String word = input.next(); // J a v a

        System.out.println("You have entered: " + word);


        input.nextLine(); // Clears the scanners memory

        System.out.println("Enter a sentence:");

        String sentence = input.nextLine();

        System.out.println("You have entered:" + sentence);


        // input.nextLine();

        System.out.println("Enter another sentence:");

        String sentence2 = input.nextLine();

        input.close();

        System.out.println("You have entered:" + sentence2);

        System.out.println("Program has ended");



    }

}
