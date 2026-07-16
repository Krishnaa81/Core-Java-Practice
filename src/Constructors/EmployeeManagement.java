package Constructors;

public class EmployeeManagement {

    int empId;
    String empName;
    String department;
    double salary;

    EmployeeManagement() {
        empId = 1;
        empName = "Krishna";
        department = "IT";
        salary = 25000;
    }

    EmployeeManagement(int empId,String empName,String department,double salary){
        this.empId=empId;
        this.empName=empName;
        this.department=department;
        this.salary=salary;
    }

    void displayEmployee() {
        System.out.println(empId+" "+empName+" "+department+" "+salary);
    }

    void incrementSalary(double amount) {
        salary += amount;
        System.out.println("Updated Salary : "+salary);
    }

    public static void main(String[] args) {

        EmployeeManagement e1 = new EmployeeManagement();
        e1.displayEmployee();

        EmployeeManagement e2 = new EmployeeManagement(2,"Ravi","HR",30000);
        e2.displayEmployee();
        e2.incrementSalary(5000);
    }
}