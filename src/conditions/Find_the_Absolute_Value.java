package conditions;

import java.util.Scanner;

public class Find_the_Absolute_Value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num<0)
			
		{
		num = num*-1;
		}
		
		System.out.println(num);
	}

}
