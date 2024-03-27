package week10_Review.CompanyTask;

import week10_Review.PracticeTask.Employee;

import java.util.ArrayList;

public class Company {

    private String companyName, location;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String companyName, String location) {
      setCompanyName(companyName);
      setLocation("None");
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        if(location == null){
            return "None";
        }

        return location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayEmployeeInfo(){
        for (Employee employee : employees) {
            System.out.println("-----------------");
            employee.displayInfo();
        }
    }

    public void hireEmployee(Employee employee){
        if(employee == null){
            throw new RuntimeException("Can not add null key to the employees list");
        }

        employees.add(employee);
    }

    public void fireEmployee(String employeeId){
        if(employeeId== null){
            throw new RuntimeException("The id can not be null");
        }
        employees.removeIf(p -> p.getEmployeeId().equalsIgnoreCase(employeeId));
    }

    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", total number of employees=" + employees.size() +
                '}';
    }

}
