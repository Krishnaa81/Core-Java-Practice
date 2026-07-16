package Basics;
import java.util.*;
public class Question4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		String Name = sc.nextLine();
		
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Bsic Salary: ");
		int basicsalary = sc.nextInt();
		
		double HRA = basicsalary*0.20;
		double DA = basicsalary*0.10;
		double grosssalary = HRA+DA+basicsalary;
		
		System.out.println("=====Employe Salary Details========");
		
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee ID: "+id);
		System.out.println("Basic Salary: "+basicsalary);
		System.out.println("HRA: "+HRA);
		System.out.println("DA: "+DA);
		System.out.println("Gross Salary: "+grosssalary);
	}

}
