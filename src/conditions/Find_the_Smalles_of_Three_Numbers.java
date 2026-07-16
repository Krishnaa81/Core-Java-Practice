package conditions;

import java.util.Scanner;

public class Find_the_Smalles_of_Three_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=b && a<=c) {
			System.out.println("smallest number : "+a);
		}else if(b<=a && b<=c){
			System.out.println("smallest number : "+b);
		}else {
			System.out.println("smallest number : "+c);
		}
		

	}

}
