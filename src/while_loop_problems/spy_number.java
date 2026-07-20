package while_loop_problems;

import java.util.Scanner;

public class spy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum=0;
		int product=1;
		
		while(num>0) {
			
			int lastdigit = num%10;   //
			sum=sum+lastdigit;      //   
			product = product*lastdigit;  //
			num=num/10;
			
		}if(sum==product)
		System.out.println("Spy number");
		else
			System.out.println("Not spy number");
	}

}
