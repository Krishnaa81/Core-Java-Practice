package Basics;
import java.util.*;
public class Question3 {
	
	public static void totalmarks(int s1,int s2,int s3,int s4,int s5) {
		int totalmarks=s1+s2+s3+s4+s5;
		System.out.println("Total Marks: "+totalmarks);
	}
	
	public static void average(int s1, int s2, int s3,int s4,int s5) {
		double average = (s1+s2+s3+s4+s5)/5;
		System.out.println("Average marks: "+average);
	}
	
	public static void percentage(int s1,int s2,int s3,int s4,int s5) {
		double percentage = ((s1+s2+s3+s4+s5)/500.0)*100;
		System.out.println("Percentage of marks: "+percentage+"%");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter five subject marks: ");
		int s1 =sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		
		totalmarks(s1,s2,s3,s4,s5);
		average(s1,s2,s3,s4,s5);
		percentage(s1,s2,s3,s4,s5);
	}

	
}
