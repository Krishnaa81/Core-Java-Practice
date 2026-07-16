package Basics;

public class find_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,5,6};
		int n = 6;
		int totalsum=n*(n+1)/2;
		
		int arraysum=0;
		
		for(int num:a) {
			arraysum=arraysum+num;
		}
		
		int missingnumber = totalsum-arraysum;
		
		System.out.println(missingnumber);

	}

}
