package week11_Review;

import java.time.LocalDate;

public final class FinalKeyword {


    public static void main(String[] args) {
         LocalDate dateOfBirth = LocalDate.of(1975,5,19);
         dateOfBirth = LocalDate.of(1989,9,10);

        System.out.println("dateOfBirth = "+dateOfBirth);

    }

    public final void method(){
        System.out.println("Method");
    }
}
