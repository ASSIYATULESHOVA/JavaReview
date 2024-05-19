package week05_Review;

public class CustomMethods2 {

    public static void main(String[] args) {

        double n = calculate(10, '*', 2);

        System.out.println(n);

        System.out.println(n + 200);


        System.out.println( calculate(1, '/',  (int)2.0)  );


    }

    public static double calculate(double num1, char operator, double num2) {

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.err.println("The denominator can not be zero " + operator);
                    System.exit(1);
                }
                result = num1 / num2;
                break;

            default:
                System.err.println("Invalid math operator: " + operator);
                System.exit(1);
        }

        return result;
    }


    public static int calculate(int num1, char operator, int num2) {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.err.println("The denominator can not be zero " + operator);
                    System.exit(1);
                }
                result = num1 / num2;
                break;

            default:
                System.err.println("Invalid math operator: " + operator);
                System.exit(1);
        }

        return result;
    }


}
