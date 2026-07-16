package Basics;

import java.util.*;
public class postive_negative_zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println("postive number "+number);
		}else if(number <0) {
			System.out.println("Negative number "+number);
		}else {
			System.out.println("Zero "+number);
		}
		

	}

}
