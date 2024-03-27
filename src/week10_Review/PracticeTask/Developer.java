package week10_Review.PracticeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {
    private String programmingLanguage;


    public Developer(String name, int age, String gender, String employeeId, double salary, String programmingLanguage) {
        super(name, age, gender, employeeId, salary);
        setProgrammingLanguage(programmingLanguage);
    }
    public String getProgrammingLanguage() {
        if(programmingLanguage == null){
            return "Java";
        }
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Java", "Python", "C#","Ruby", "C++"));
        if( !list.contains(programmingLanguage)){
            System.err.println("No such a programming language "+programmingLanguage);
            System.exit(1);
        }else{
            this.programmingLanguage = programmingLanguage;
        }

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming language is: "+programmingLanguage);

    }

    public void work(){
        System.out.println("Developer "+ getName() + " is coding in "+programmingLanguage);
    }
}
