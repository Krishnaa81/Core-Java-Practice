package while_loop_problems;

import java.util.Scanner;

public class primeupto_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pc=0;
		
		for(int i=1; pc<n;i++) {
			int fc=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					fc++;
				}
			}
			if(fc==2) {
				System.out.print(i+" ");
				pc++;
			}
		}
	}

}
