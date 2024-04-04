package week02_Review.practiceTasks;

public class EmailGeneratorBadPractice {

    public static void main(String[] args) {

        String firstName = "DANIEL";
        int birthYear = 1985;

        System.out.println("Your generated emails are:");
        System.out.println("\tYahoo: " + firstName + "_" + birthYear + "@yahoo.com");
        System.out.println("\tGmail: " + firstName + "_" + birthYear + "@gmail.com");
        System.out.println("\tOutlook: " + firstName + "_" + birthYear + "@outlook.com");
        System.out.println("\tHotmail: " + firstName + "_" + birthYear + "@hotmail.com");


    }

}
