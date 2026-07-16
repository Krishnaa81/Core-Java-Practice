package conditions;

import java.util.Scanner;

public class Number_Range_Checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		if(n1>=1 && n1<=50) {
			System.out.println("Number is between 1 and 50 : "+n1);
		}else if(n1>=51 && n1<=100) {
			System.out.println("Number is between 51 and 100 : "+n1);
		}else {
			System.out.println("Greater than 100 : "+n1);
		}
	}

}
