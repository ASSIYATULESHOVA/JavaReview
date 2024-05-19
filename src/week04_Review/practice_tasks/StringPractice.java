package week04_Review.practice_tasks;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "Java Developer";
        String s2 = "Java Developer";
        String s3 = "Java Developer";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        String s4 = new String("Java Developer");
        String s5 = new String("Java Developer");

        System.out.println(s4 == s5);

        s1 = "abc";
        s2 = "abc";

        System.out.println( "s1==s2 is: " + s1 == s2 );
        //                   "s1==s2 is: abc"  == "abc"

        System.out.println("------------------------------------------------");


        String str = "Monday";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(  str.length() -1  ));

        System.out.println( str.indexOf("n") );


        str = str.toLowerCase();  // "monday"

        System.out.println(str);

        str = str.toUpperCase(); // "MONDAY"

        System.out.println(str);


        str = "abcabcabcabc";

        str = str.replace("a", "X").replace("b", "Y").replace("c", "Z");

        System.out.println(str);


        String ta = "A";
        ta += "B"; // ta = ta + "B",  ta = "AB"

        String tb = "C";
        ta += tb; // ta = ta + "C" ,  ta = "ABC"

        ta.replace('C', 'D'); // "ABD"

        System.out.println(ta);


        str = "AAAABBBCCC";

        str = str.replaceFirst("A", "X").replaceFirst("B", "Y").replaceFirst("C", "Z");

        System.out.println(str);


        String firstName = "guLNORA";
        String lastName = "mahMUDK";

        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();

        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();


        System.out.println(firstName);
        System.out.println(lastName);


        String email = "jonathan_king@gmail.com";

        firstName =  email.substring(0,   email.indexOf("_"));
        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();

        lastName = email.substring(email.indexOf("_") + 1,  email.indexOf("@") );
        lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();


        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println("----------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Did you complete your assignment? Yes/No");

        String answer = input.nextLine().toLowerCase();

        if(answer.equals("yes")){
            System.out.println("Great Job!");
        }else if(answer.equals("no")){
            System.out.println("Please complete the assignment");
        }else{
            System.out.println("Invalid entry");
        }

        System.out.println("Enter your favorite programming language:");
        String language = input.nextLine();

        boolean hasJava = language.toLowerCase().contains("java");

        if(hasJava){
            System.out.println("Your favorite language is Java");
        }else{
            System.out.println("Your favorite language is NOT Java");
        }

        System.out.println("hasJava = " + hasJava);

        input.close();



        /*
        if(answer.equals("yes")){
            System.out.println("Great Job!");
        }

        if(answer.equals("no")){
            System.out.println("Please complete the assignment");
        }

        if(!answer.equals("yes") && !answer.equals("no")){
            System.out.println("Invalid entry");
        }
        */





    }

}
