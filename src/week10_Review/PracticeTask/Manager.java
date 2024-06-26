package week10_Review.PracticeTask;

import week10_Review.PracticeTask.Employee;

public class Manager extends Employee {

    private String department;

    public Manager(String name, int age, String gender, String employeeId, double salary, String department) {
        super(name, age, gender, employeeId, salary);
        setDepartment(department);
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department is : "+getDepartment());
    }

    @Override
    public void work() {
        System.out.println("Manager "+getName()+" is managing "+getDepartment());
    }
}
