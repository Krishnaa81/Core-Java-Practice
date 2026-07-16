package conditions;

import java.util.Scanner;

public class Electricity_Tariff_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int units = sc.nextInt();
		
		if(units>=0 && units <=100) {
			System.out.println("Electricity Bill =  ₹"+ (units *2));
		}else if(units >=101 && units <=200) {
			System.out.println(" Electricity Bill =  ₹"+(units *3));
		}else if(units >=201 && units <=500) {
			System.out.println("Electricity Bill = ₹"+(units*5));
		}else if(units >=500) {
			System.out.println("Electricity Bill = ₹"+(units*7));
		}else {
			System.out.println("Invalid units");
			
		}
		
	}

}
