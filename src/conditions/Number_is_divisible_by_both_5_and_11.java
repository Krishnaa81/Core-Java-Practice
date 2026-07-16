package conditions;

import java.util.Scanner;

public class Number_is_divisible_by_both_5_and_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year % 400 == 0 ) || (year%4 ==0 && year%100 !=0)) {
			
			System.out.println(year + " is a Leap Year");
		}else {
			System.out.println(year+ " is not leap lear");
		}

	}

}
