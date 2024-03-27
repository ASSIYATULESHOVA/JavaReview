package week10_Review.PracticeTask;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name){
    setName(name);
    }

    public Person(String name, int age){
        this(name);
        setAge(age);
    }
    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        if( age < 0){
            throw new RuntimeException("Age is set to negative number");
        }
        return age;
    }

    public void setAge(int age) {
        if( age < 0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        if(gender == null){
            throw new RuntimeException("Gender has not been set");
         //   return "Unknown";
        }
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender");
            System.exit(1);
        }

    }
}
