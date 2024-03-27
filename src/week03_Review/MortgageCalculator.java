package week03_Review;
import java.text.DecimalFormat;
public class MortgageCalculator {
    public static void main(String[] args) {

        double loanAmount = 600_000;
        int loanTermInYears = 30;
        String loanType = "FHA";

        double today_30_years_fixed_rate = 7.5;
        double today_15_years_fixed_rate = 6.9;
        double today_30_years_fha_rate = 7.24;
        double today_15_years_fha_rate = 6.62;
        double today_30_years_va_rate = 6.5;
        double today_15_years_va_rate = 5.99;

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
        }

        }


        }

