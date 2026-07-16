package Basics;

public class Find_Even_Sum_inarray {

	public static void main(String[] args) {
		
		int a[]= {2,4,3,5,6,7,8,9};
		
		int sum=0;
		for(int i:a) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
