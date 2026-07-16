package conditions;

import java.util.Scanner;

public class Student_Attendance_Eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int attendence = sc.nextInt();
		
		if(attendence >=75) {
			System.out.println("Eligible for exam ");
		}else {
			System.out.println("Not eligible for exam");
		}

	}

}
