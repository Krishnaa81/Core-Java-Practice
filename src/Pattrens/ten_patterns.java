package Pattrens;

import java.util.Scanner;

public class ten_patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
//		int n = sc.nextInt();
//		int num=1;
//		char ch = 'A';
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				
//				if(j%2 !=0) {
//					System.out.print(ch+" ");        //1st one
//					ch++;
//				}
//				
//				else {
//					System.out.print(num+" ");
//					num++;
//				}
//			}
//			System.out.println();
//		}
		
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			int num=i;
//			for(int j=1;j<=n+1;j++) {
//				System.out.print(num+" ");      //2nd one
//				num++;
//				if(num>n) {
//					num=1;
//				}
//			}
//			System.out.println();
//		}
		
		
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}                                         //4th one
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

		
//		int n = sc.nextInt();
//		for(int i=n;i>=1;i--) {
//		
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");        //5th one
//			}
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=2*i-1;j++) {         //6th one
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
//		int n = sc.nextInt();
//		
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");         //7th one
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {         
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
//		int n = sc.nextInt();
		
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");         
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
