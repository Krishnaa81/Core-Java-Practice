package Practice;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		//int rev = 0;
		String rev = "";
		
		while(num!=0) {
			int temp = num%10;
			//rev = rev*10+temp;
			rev = rev+temp;
			num = num/10;
		}
		System.out.println(rev);

	}

}
