package week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};


        ArrayList list = new ArrayList();  // ArrayList of Object

        list.add("Java");
        list.add(100);
        list.add(2.5);
        list.add(true);
        list.add(new Item("Headphone", 5, 3.5));
        list.add('A');

        System.out.println(list);

        // System.out.println(list.get(0).toUpperCase());


        ArrayList<String> elements = new ArrayList<>(); // ArrayList of String

        elements.add("Java");
        // elements.add(100);

        System.out.println(elements);

        // elements.


        ArrayList<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Java", "Python", "Python", "Ruby", "Ruby", "C#"));

        System.out.println(words);

        for (String each : words) {
            if (Collections.frequency(words, each) == 1) {
                System.out.println(each);
            }
        }

        System.out.println("----------------------------------");

        words.forEach(p -> {
            if (Collections.frequency(words, p) == 1)
                System.out.println(p);
        });

        System.out.println(words);

        System.out.println("----------------------------------");

        ArrayList<String> temp = new ArrayList<>(words);
        temp.removeIf( p ->  Collections.frequency(temp, p) != 1 );

        System.out.println(temp);
        System.out.println(words);


    }

}
