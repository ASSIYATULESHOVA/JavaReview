package week03_Review.practice_task;

public class MortgageCalculator {

    public static void main(String[] args) {

        double loanAmount = 600_000;
        int loanTermInYears = 30;
        String loanType = "FHA";

        double today_30_years_fixed_rate = 7.5;
        double today_15_years_fixed_rate = 6.9;
        double today_30_years_fha_rate = 7.24;
        double today_15_years_fha_rate = 6.62;
        double today_30_years_va_rate =  6.5;
        double today_15_years_va_rate =  5.99;

        double annualInterestRate = 0;

        switch (loanType) {
            case "Fixed":
                switch (loanTermInYears) {
                    case 30:
                        annualInterestRate = today_30_years_fixed_rate;
                        break;
                    case 15:
                        annualInterestRate = today_15_years_fixed_rate;
                        break;
                }
                break;

            case "FHA":
                switch (loanTermInYears) {
                    case 30:
                        annualInterestRate = today_30_years_fha_rate;
                        break;
                    case 15:
                        annualInterestRate = today_15_years_fha_rate;
                        break;
                }
                break;

            case "VA":
                switch (loanTermInYears) {
                    case 30:
                        annualInterestRate = today_30_years_va_rate;
                        break;
                    case 15:
                        annualInterestRate = today_15_years_va_rate;
                        break;
                }
                break;

            default:
                System.err.println("Invalid loan type");
                System.exit(1);
        }


        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Loan amount: $" + loanAmount);
        System.out.println("Annual Interest Rate for " + loanTermInYears +" years " +loanType +" loan is " + annualInterestRate + "%");
        System.out.println("Your monthly mortgage payment  is: $" + Math.round(monthlyPayment) );


        /*
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("Your monthly mortgage payment  is: $" + df.format(monthlyPayment) );
        */

        // 10 * 10 ===> 10^2
        // 10^4 ====> Math.pow(10, 4)
        //Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00

    }
}
