package conditions;

import java.util.Scanner;

public class Addition_of_Two_Numbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int a = sc.nextInt();
	
	System.out.print("Enter second number: ");
	int b = sc.nextInt();
	
	System.out.println(" ");
	System.out.println("Sample outputs: ");
	System.out.println("---------------");
	System.out.println("Addition =  "+(a+b));
	System.out.println("Subtraction = "+(a-b));
	System.out.println("Multiplication = "+(a*b));
	System.out.println("Division = "+(a/b));
	System.out.println("Modulus = "+(a%b));
	

	}

}
