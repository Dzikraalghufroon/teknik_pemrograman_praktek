package id.ac.polban.employee;

import id.ac.polban.employee.model.Department;
import id.ac.polban.employee.model.Employee;
import id.ac.polban.employee.model.EmploymentType;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Department IT = new Department("IT");
        Department Logistic = new Department("Logistik");
        EmploymentType fulltime = new EmploymentType("Full-Time");
        EmploymentType parttime = new EmploymentType("Part-Time");

        Employee employee1 = new Employee("Ucok", Logistic,fulltime, 1500000);
        Employee employee2 = new Employee("Ujang", IT, parttime, 20000000);


        service.addEmployee(employee1);
        service.addEmployee(employee2);

        System.out.println("Data Karyawan");
        printData(service.getEmployee(1));
        printData(service.getEmployee(2));
        System.out.println("ujang mengalami kenaikan gajii");
        service.raiseSalary(2, 85);

        System.out.println("Data Karyawan setelah ujang mengalami kenaikan gaji");
        printData(service.getEmployee(1));
        printData(service.getEmployee(2));
        

    }
    private static void printData(Employee employee){
            System.out.println("ID         : " + employee.getId());
            System.out.println("Nama       : " + employee.getName());
            System.out.println("Department : " + employee.getDepartment().getName());
            System.out.println("Tipe       : " + employee.getType().getType());
            System.out.println("Gaji       : Rp " + String.format("%,.0f", employee.getSalary()));

    }
}
