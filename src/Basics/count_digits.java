package Basics;

import java.util.*;
public class count_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count=0;
		
//		for(int i=1;i<=num;i++)
//		{
//			num=num/10;
//			count++;
//		}
//		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		
	}
	

}
