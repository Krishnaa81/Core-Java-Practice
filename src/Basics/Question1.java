package Basics;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the Student Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter the Student Age: ");
			int age = sc.nextInt();
			
			System.out.print("Enter the Student Marks: ");
			int marks = sc.nextInt();
			
		System.out.println("=========student details========");	
		
			System.out.println("Student Name is "+name);
			System.out.println("Student Age is "+age);
			System.out.println("Student Marks is "+marks);
	}

}
