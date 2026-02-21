package id.ac.polban.employee.model;

import static id.ac.polban.employee.model.EmploymentType.*;
public class Employee {
    private int id;
    private String name;
    private Department department;
    private EmploymentType type;
    private double salary;
    private  static int counterId = 1;
    
    public Employee(String name, Department department, EmploymentType type, double salary) {
        this.id = counterId++;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
    } 

    public static Employee CreateFullTime(String name, Department department, double salary){
        return new Employee(name, department,FULL_TIME  ,salary);
    }

    public static Employee CreatePartTime(String name, Department department, double salary){
        return new Employee(name, department,PART_TIME  ,salary);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public EmploymentType getType() {
        return type;
    }
    public void setType(EmploymentType type) {
        this.type = type;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
