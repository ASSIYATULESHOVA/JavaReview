package week03_Review;

public class IfStatements {
    public static void main(String[] args) {

        int number = 101;

        /*
        if( number % 2 == 0 ){
            System.out.println(number + " is an even number");
        }

        if ( number % 2 != 0){
            System.out.println(number + " is an odd number");
        }

         */

        if(number % 2 == 0){ //if the number is evenly divisible by 2, then it's an even number

            System.out.println(number + " is an even number");

        }else{ // otherwise: if the number is NOT evenly divisible by 2, then it's an odd number

            System.out.println(number + " is an odd number");

        }

        System.out.println("--------------------------------");

        number = -10;

        if(number >= 0){

            if( number % 15 == 0 ) { // if the number is divisible by both 3 & 5, then print "FINRA"
                System.out.println("FINRA");
            }else if(number % 3 == 0){ // But if the number is ONLY divisible by 3, then print "FIN"
                System.out.println("FIN");
            }else if(number % 5 == 0){ // But if the number is ONLY divisible by 5, then print "RA"
                System.out.println("RA");
            }else{ // Otherwise: if the number is not evenly divisible by 3 or 5, then print the number itself
                System.out.println(number);
            }

        }else{
            System.out.println("Invalid number");
        }





    }

}


