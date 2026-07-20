package while_loop_problems;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enetr the number:");
		
		int num = sc.nextInt();
		int temp=num;
		int rev = 0;
		
		while(num>0) {
			int lastdigit = num%10;
			rev = rev*10+lastdigit;                  // print reverse number
			num = num/10;
		}System.out.println(rev);
		
//		int count =0;
//		while(num>0) {
//			int lastdigit = num%10;                 // print count of given number
//			count++;
//			num = num/10;
//		}System.out.println(count);
		
		if(temp==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
