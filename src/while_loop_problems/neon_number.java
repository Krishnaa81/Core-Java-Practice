package while_loop_problems;

import java.util.Scanner;

public class neon_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum=0;
		int power = num*num;
		System.out.println(power);
		
		while(power>0) {
			int lastdigit = power%10;
			sum=sum+lastdigit;
			power=power/10;
		}
		System.out.println(sum);
		if(sum==num)
		System.out.println("neon number");
		else
			System.out.println("not neon number");
		
	}

}
