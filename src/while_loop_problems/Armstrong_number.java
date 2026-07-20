package while_loop_problems;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int ans = num;
		int temp=num;
		
		
		int count =0;
		while(num>0) {
			int lastdigit = num%10;
			count++;
			num=num/10;
		}
		int sum=0;
		while(ans>0) {
			int rem=ans%10;
			sum=sum+(int)Math.pow(rem, count);
			ans = ans/10;
			
		}
		if(sum==temp)
		
		System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
		
	}
}
