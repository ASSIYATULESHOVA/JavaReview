package week05_Review;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Enter a number:");
        int num1 = input.nextInt();

        System.out.println("Enter a number:");
        int num2 = input.nextInt();

        System.out.println("Enter a number:");
        int num3 = input.nextInt();

        System.out.println("Enter a number:");
        int num4 = input.nextInt();

        System.out.println("Enter a number:");
        int num5 = input.nextInt();

         */


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        double average = 0;
        int sum = 0;

        int times = 5;

        for (int i = 0; i < times; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();  // 100, 20, 300

            if(num > max){ //  if user entered number is greater than the current maximum number
                max = num; //  then we need replace the current maximum value with the user entered number
            }

            if(num < min){ //  if user entered number is smaller than the current minimum number
                min = num; //  then we need replace the current minimum value with the user entered number
            }

            sum += num;

        }


        average = (double)sum / times;

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        System.out.println("Average number is: " + average);



    }


}
