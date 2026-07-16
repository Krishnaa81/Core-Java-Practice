package Basics;

public class Array_practice {

	public static void main(String[] args) {
		
//		int a[] = {2,4,5,2,4,6};
//		
//		for(int i=0;i<a.length;i++) {
//			int arr=0;
//			
//			for(int j=0;j<a.length;j++) {          //if we using j<i  and if(a[i]==a[j]) { arr ++;   using this condition the we get remove duplicate number like if ther more than one same number duplicates we can get one number thaall numbers;
//				
//				if(i!=j && a[i]==a[j]) {
//					arr++;
//				}
//				
//				if(a[i]==a[j]) {
//					arr++;
//				}
//			}
//			if(arr==0) {
//				System.out.print(a[i]+" ");
//				
//			}
			
//		}
		
		int a[]= {2,4,45,32,67,43,21};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
