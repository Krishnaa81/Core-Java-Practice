package conditions;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("Even Number: "+a);
		}else {
			System.out.println("Odd Number: "+a);
		}

	}

}
