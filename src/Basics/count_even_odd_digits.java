package Basics;

import java.util.Scanner;

public class count_even_odd_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a[] = {10,30,50,40,1};
		int min=a[0];
		for(int i=1;i<a.length;i++){
				if(a[i]<min) {
					min=a[i];
				}

	}
		System.out.println(min);
	
	}
}
