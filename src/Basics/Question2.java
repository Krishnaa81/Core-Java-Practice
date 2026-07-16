package Basics;
import java.util.*;
public class Question2 {

	public static void  add(int a, int b) {
		System.out.println("Adition: "+(a+b));
	}
	public static void subtraction(int a, int b) {
		System.out.println("Subtraction: "+(a-b));
	}
	public static void multiplication(int a,int b) {
		System.out.println("multiplication: "+(a*b));
	}
	public static void division(int a, int b) {
		System.out.println("Division: "+(a/b));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second number: ");
		int b = sc.nextInt();
		
		add(a,b);
		subtraction(a,b);
		multiplication(a,b);
		division(a,b);
	}

}

//public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//
//System.out.print("Enter First Number ");
//int a = sc.nextInt();
//
//System.out.print("Enter Second Number ");
//int b = sc.nextInt();
//
//System.out.println("=======Answers======");
//
//System.out.println("Addition of two numbers: "+(a+b));
//System.out.println("Subtraction of two numbers: "+(a-b));
//System.out.println("Multiplication of two numbers: "+(a*b));
//System.out.println("Division of two numbers: "+(a/b));
//}
