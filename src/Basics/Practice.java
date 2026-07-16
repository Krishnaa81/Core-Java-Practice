package Basics;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		System.out.print("Enter second number: ");
		int mun=sc.nextInt();
		
		int temp=0;
		
		temp=num;
		num=mun;
		mun=temp;
		
		System.out.println(num);
		System.out.println(mun);
		
	}

}
