package while_loop_problems;

import java.util.Scanner;

public class productof_eachnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int product = 1;
		
		while(num>0) {
			int lastdigit = num%10;
			product = product*lastdigit;
			num=num/10;
		}System.out.println(product);

	}

}
