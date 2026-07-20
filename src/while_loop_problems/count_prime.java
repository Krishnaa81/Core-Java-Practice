package while_loop_problems;

import java.util.Scanner;

public class count_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count =0;
		
		while(num>0) {
			
			int lastdigit = num%10;
			
//			if(lastdigit ==2 || lastdigit ==3 || lastdigit == 5 || lastdigit==7) {
//				count++;
			
			int fc =0;
			for(int i=1;i<=lastdigit;i++) {
				if(lastdigit%i==0) {
					fc++;
				}
			}
			if(fc==2) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

	}

}
