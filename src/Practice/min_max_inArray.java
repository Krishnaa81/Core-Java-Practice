package Practice;

public class min_max_inArray {

	public static void main(String[] args) {
		
		//Maxmim Number
		
//		int a[] = {12,5,32,395,87,21,11,64};
//		int max = a[0];
//		
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println("Maximum number: "+max);
			
		
			// minimum number
		
		int a[]= {2,5,4,7,3,9,8,1,6};
		int min = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum Number is: "+min);
	}

}
