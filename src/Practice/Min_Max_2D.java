package Practice;

public class Min_Max_2D {

	public static void main(String[] args) {


		int a[][] = {{21,4345,7},{21,43,11,8},{6,987,20,31,6521}};
		
		//int max = a[0][0];
		
		int min = a[0][0];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
//				if(a[i][j]>max) {
//					max=a[i][j];
//				}
				
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		
		//System.out.println("Maximum Number is: "+max);
		
		System.out.println("Minimum Number is: "+min);

	}

}
