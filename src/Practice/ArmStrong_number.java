package Practice;

import java.util.Scanner;

public class ArmStrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int ans=num;
		int count=0;
		int sum=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		int key = ans;
		
		while(key!=0) {
			int temp=key%10;
			sum=sum+(int)Math.pow(temp, count);
			key=key/10;
			
		}
		
		if(sum==ans) {
			System.out.println("ArmStrong Number: "+ans);
		}else {
			System.out.println("Is Not a ArmStrong Number: "+ans);
		}
		

	}

}
