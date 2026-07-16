package conditions;

import java.util.Scanner;

public class Pass_or_Fail_in_All_Subjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		
		if(sub1>=35 && sub2>=35 && sub3>=35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
