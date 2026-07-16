package Practice;

public class Duplicate_number_removing_inArray {

	public static void main(String[] args) {


		int a[] = {2,4,3,5,4,2,6,7,4,5,9,9,1,0,65};
		
		for(int i=0;i<a.length;i++) {
			int arr=0;
			for(int j=0;j<a.length;j++) {
				
				if(i!=j && a[i]==a[j]) {
					arr++;
				}
			}
				if(arr==0) {
					System.out.print(a[i]+" ");
				}
		}

	}

}
