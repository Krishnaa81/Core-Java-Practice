package Pattrens;

import java.util.Scanner;

public class fivteen_number_patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n=sc.nextInt();
//		
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {                    //1st one
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//		int n = sc.nextInt();
//		for(int i=n;i>=1;i--) {
//			for(int j=i;j<=n;j++) {
//				System.out.print(i+" ");     //2nd one
//			}
//			System.out.println();
//		}
//		int num=1;
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(num+" ");       //3rd  one
//				num++;
//			}
//			System.out.println();
//		}
	
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");        //4th one
//			}
//			System.out.println();
//		}
		
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(i%2 !=0) {
//				for(int j=1;j<=n;j++) {
//					System.out.print(j+" ");
//				}                                         //5th one
//			}else {
//					for(int j=4;j>=1;j--) {
//						System.out.print(j+" ");
//				}
//			}
//			System.out.println();
//		}
		
//		int n=sc.nextInt();
//		for(int i=n;i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(j+" ");           //6th one
//			}
//			System.out.println();
//		}
		
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");     //7th one
//			}
//			System.out.println();
//		}
		
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=i;j>=1;j--) {              //8th one
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=i;j--) {                  //9th one
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {                  //10th one
//				System.out.print("A"+" ");
//			}
//			System.out.println();
//		}
		
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(i%2 !=0) {
//				for(int j=1;j<=n;j++) {
//					if(j==4) {
//						System.out.print((i+1)+" ");          //11th one
//					}else {
//						System.out.print(i+" ");
//					}
//				}
//			}else {
//				for(int j=1;j<=n;j++) {
//					if(j==1) {
//						System.out.print((i+1)+" ");
//					}else {
//						System.out.print(i+" ");
//					}
//				}
//			}
//		
//		System.out.println();
//		}
		
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			char ch = 'A';
//			for(int j=1;j<=n;j++) {
//				System.out.print(ch+" ");         //12th one
//				ch++;
//			}
//		
//		System.out.println();
//	}
		
//		char ch = 'A';
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=n;j++) {
//				System.out.print(ch+" ");     //13th one
//				ch++;
//			}
//			System.out.println();
//		}
		
		
//		int n = sc.nextInt();
//		
//		int num=0;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(num+" ");         //14th one
//				num--;
//			}
//			System.out.println();
//		}
		
		int n=sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++) {
			if(i%2 !=0) {
				for(int j=1;j<=n;j++) {
					System.out.print(num+" ");
					num++;
				}
			}else {
				int temp = num+3;
				for(int j=n;j>=1;j--) {
					System.out.print(temp+" ");
					temp--;
					num++;
					
				}
			}
			System.out.println();
		}
		
	}

}
