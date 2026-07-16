package conditions;

import java.util.Scanner;

public class Day_Type_Using_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		switch(day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Working Day");
				break;
			case 6:
			case 7:
				System.out.println("Weekend");
				break;
				default:
					System.out.println("Invalid day");
					
//		}if(day>=1 && day<=5) {
//			System.out.println("Working day");
//		}else if(day>=6 && day<=7) {
//			System.out.println("Weekend");
//		}else {
//			System.out.println("Invalid day");
					
		}

	}

}
