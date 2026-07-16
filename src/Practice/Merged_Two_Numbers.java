package Practice;

public class Merged_Two_Numbers {

	public static void main(String[] args) {
		
		int a[] = {11,22,33};
		int b[] = {44,55,66,77};
		
		int c[] = new int[a.length+b.length];
		
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[a.length+j]=b[j];
		}
		
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
	}

}
