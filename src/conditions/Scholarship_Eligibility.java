package conditions;

import java.util.Scanner;

public class Scholarship_Eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int percentage = sc.nextInt();
		double income = sc.nextDouble();
		
		if(percentage>=75) {
			if(income <= 200000) {
				System.out.println("Scholarship Approved");
			}else {
				System.out.println("Scholarship Not Approved");
			}
		}else {
			System.out.println("Scholarship Not Approved");
		}

	}

}
