package Practice;

public class Missing_Number {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,6};
		
		int n = 6;
		
		int expectedsum = n*(n+1)/2;
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		int missingnumber=expectedsum-sum;
		System.out.println(missingnumber);

	}

}
