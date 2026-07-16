package Basics;

public class Array_length {

	public static void main(String[] args) {
		int a[][] = {
				
				{64,21,40},{98,69,676374,70,99},{118,282,1,113,333,234,44,55,200,66,77,2348489}
		};
		
//		System.out.println("first array length: "+a[0].length);
//		System.out.println("Second array length: "+a[1].length);
//		System.out.println("Third array length: "+a[2].length);
//		
//		System.out.println("Total multi dimention array: "+a.length);
//		
//		System.out.println(a[0][2]);
		
		
		int max=a[0][0];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++){
				
				if(a[i][j]<max) {
					max=a[i][j];
				}
				
			}
		
		}System.out.println(max);

	}

}
