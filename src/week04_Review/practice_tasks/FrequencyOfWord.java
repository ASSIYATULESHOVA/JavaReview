package week04_Review.practice_tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String word = "java";
        String sentence = "Java Java Java JAVA Java";

        String temp = sentence.toLowerCase().replace(word.toLowerCase(), word.substring(1));
        int frequency = sentence.length() - temp.length();

        System.out.println(frequency);


    }

}