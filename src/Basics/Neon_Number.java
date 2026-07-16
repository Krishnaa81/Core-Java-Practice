package Basics;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int square = num*num;
		int sum=0;
		while(square>0) {
			int rem=num%10;
			sum=sum+rem;
			square=num/10;
		}if(sum==num) {
			System.out.println("Its a Neon number");
		}else {
			System.out.println("Its not a neon number");
		}

	}

}
