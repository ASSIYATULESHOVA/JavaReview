package week08_Review;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {



        LocalDate christmasDay = LocalDate.of(2023, 12, 25 );

        System.out.println(christmasDay.format(DateTimeFormatter.ofPattern("EEEE, MMMM/d/y")));

        System.out.println(christmasDay.format(DateTimeFormatter.ISO_DATE));


        LocalTime time = LocalTime.of(10, 30);
        System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm a")));

    }

}
