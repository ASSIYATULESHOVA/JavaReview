package week12_Review;

import week10_Review.PracticeTask.Developer;
import week10_Review.PracticeTask.Employee;
import week10_Review.PracticeTask.Manager;
import week10_Review.PracticeTask.Person;
import week11_Review.ShapeTask.Circle;
import week11_Review.ShapeTask.Shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

        Object obj1 = new Circle(4);  //Object type : Circle, Reference type : Object

        Shape shape = (Shape) obj1;   // Object type : Circle, Reference type : Shape

        Circle circle = (Circle)shape;   // Object type : Circle, Reference type : Circle

        System.out.println(shape.calcArea());
        System.out.println(circle.getRadius());


        System.out.println("===========================================================");

        Person person = new Person("Josh",28);
        Manager manager= new Manager("Maria",30,"F","a01",100000,"Developer");
        Employee employee = new Employee("Edward",35,"M","a02",120000);
        Developer developer = new Developer("Dauren",35,"M","a03",100000,"Java");

       Person [] arr = {person,manager,employee,developer};

        for (Person each : arr) {
            if(each instanceof Employee){
                System.out.println(each.getName() + " : " + each.getAge() + " : "+( (Employee) each).getSalary());
            }else {
                System.out.println(each.getName() + " : " + each.getAge());
            }
        }












    }
}
