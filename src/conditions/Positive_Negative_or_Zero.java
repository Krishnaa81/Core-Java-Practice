package conditions;

import java.util.Scanner;

public class Positive_Negative_or_Zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("Postive number: "+a);
		}
		else if(a == 0){
			System.out.println("Zero: "+a);
		}
		else {
			System.out.println("Negative number: "+a);
		}

	}

}
