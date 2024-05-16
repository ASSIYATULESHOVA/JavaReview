package week03_Review;

public class Ternary {

    public static void main(String[] args) {

        int n = -10;

        String month = "";

        /*
        if (n >= 1 && n <= 12) {
            if (n == 1) {
                month = "January";
            } else if (n == 2) {
                month = "February";
            } else if (n == 3) {
                month = "March";
            } else if (n == 4) {
                month = "April";
            } else if (n == 5) {
                month = "May";
            } else if (n == 6) {
                month = "June";
            } else if (n == 7) {
                month = "July";
            } else if (n == 8) {
                month = "August";
            } else if (n == 9) {
                month = "September";
            } else if (n == 10) {
                month = "October";
            } else if (n == 11) {
                month = "November";
            } else {
                month = "December";
            }
        }else{
            month = "No such a month";
        }
*/

        month =  (n >= 1 && n <= 12)?
                (n == 1) ? "January" : (n == 2) ? "February" : (n == 3) ? "March" : (n == 4) ? "April" : (n == 5) ? "May"
                        : (n == 6) ? "June" : (n == 7) ? "July" : (n == 8) ? "August" : (n == 9) ? "September" : (n == 10) ? "October"
                        : (n == 11) ? "November" : "December"
                :"No such a month";


        System.out.println("month = " + month);

        System.out.println("-----------------------------------");


        if (n >= 1 && n <= 12)

            if (n == 1) month = "January";
            else if (n == 2) month = "February";
            else if (n == 3) month = "March";
            else if (n == 4) month = "April";
            else if (n == 5) month = "May";
            else if (n == 6) month = "June";
            else if (n == 7) month = "July";
            else if (n == 8) month = "August";
            else if (n == 9) month = "September";
            else if (n == 10) month = "October";
            else if (n == 11)  month = "November";
            else month = "December";

        else
            month = "No such a month";




    }
}
