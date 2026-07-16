package Practice;

import java.util.Scanner;

public class Even_Odd_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		
		int n = sc.nextInt();
		
		System.out.print("Enter array elimantes: ");
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			System.out.println(a[i]);
		}
		
	}

}
