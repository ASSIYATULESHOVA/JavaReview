package week10_Review.PracticeTask;

import week10_Review.CompanyTask.Company;
import week10_Review.PracticeTask.Developer;
import week10_Review.PracticeTask.Employee;
import week10_Review.PracticeTask.Manager;
import week10_Review.PracticeTask.Person;

public class TestPerson {
    public static void main(String[] args) {

   Person person1 = new Person("Asiya",25,"F");
        System.out.println(person1);

        System.out.println(person1.getName().toUpperCase());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

 Employee employee = new Employee("Asiya",28,"F","A09",150000);
        System.out.println(employee);

        employee.displayInfo();
        employee.work();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        Developer developer = new Developer("Asiya",28,"F","A09",150000,"Java");

        System.out.println(developer);

       developer.displayInfo();

       developer.work();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

    Manager manager = new Manager("Saya",28,"F","A03",150000,"IT department");
        System.out.println(manager);

        manager.displayInfo();
        manager.work();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Company company = new Company("Google Inc","New York");
        System.out.println(company);

        company.hireEmployee(developer);
        company.hireEmployee(manager);
        System.out.println(company);
        company.hireEmployee( new Developer("Fey",28,"M","A05",100000,"Python"));
        company.hireEmployee( new Developer("Ana",38,"F","A06",110000,"Python"));
        company.hireEmployee( new Developer("Maria",30,"F","A07",130000,"Java"));
        company.fireEmployee("A03");
        System.out.println(company);

        company.displayEmployeeInfo();
        System.out.println(company);


















    }
}
