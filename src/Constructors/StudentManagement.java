
package Constructors;

public class StudentManagement {

    int id;
    String name;
    String course;
    double fees;

    StudentManagement() {
        id = 101;
        name = "Krishna";
        course = "Java";
        fees = 25000;
    }

    StudentManagement(int id, String name, String course, double fees) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }

    void displayStudent() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Fees : " + fees);
    }

    void updateFees(double newFees) {
        fees = newFees;
        System.out.println("Updated Fees : " + fees);
    }

    public static void main(String[] args) {

        StudentManagement s1 = new StudentManagement();
        s1.displayStudent();

        System.out.println();

        StudentManagement s2 = new StudentManagement(102,"Rahul","Python",30000);
        s2.displayStudent();
        s2.updateFees(32000);
    }
}