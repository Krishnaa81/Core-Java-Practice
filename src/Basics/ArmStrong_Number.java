package Basics;

import java.util.Scanner;

public class ArmStrong_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int ans = num;
		int sum=0;
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		int key=ans;
		
		while(key!=0) {
			int temp = key%10;
			sum=sum+(int)Math.pow(temp,count);
			key=key/10;
			
		}if(sum==ans) {
			System.out.println("ArmStrong number: "+ans);
			
		}else {
			System.out.println("not a armstrong number: "+ans);
		}
	}

}
