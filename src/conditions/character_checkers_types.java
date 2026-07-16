package conditions;

import java.util.Scanner;

public class character_checkers_types {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z') {
			System.out.println("Upper Case");
		}else if(ch>='a' && ch<='z') {
			System.out.println("Lower Case");
		}else if(ch>='0'&& ch<='9') {
			System.out.println("digit");
			
		}else {
			System.out.println("Special characters");
		}
	}

}
