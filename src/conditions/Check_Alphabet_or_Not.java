package conditions;

import java.util.Scanner;

public class Check_Alphabet_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Alphabet");
		}else if(ch>='A' && ch<='Z'){
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not Alphabet");
		}

	}

}
