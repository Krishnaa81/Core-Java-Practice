package conditions;

import java.util.Scanner;

public class Divisible_by_5_and_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%5==0 && a%11==0) {
			System.out.println("Number is divisible by both 5 and 11 : "+a);
		}else {
			System.out.println("Number is not divisible by both 5 and 11 : "+a);
		}

	}

}
