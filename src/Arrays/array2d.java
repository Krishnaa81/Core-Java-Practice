	package Arrays;
	
	public class array2d {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
	//		int sum=0;
	//		
	//		
	//		
	//		
	//		for(int i=0;i<a.length;i++) {
	//			
	//			for(int j=0;j<a[i].length;j++) {
	//				
	//				
	//				if(a[i][j]%2==1) {
	//					
	//				
	//				sum=sum+a[i][j];
	//				}
	//				
	//			}
	//			
	//		}
	//		System.out.println(sum);
	//		
			int a[] = {11,5,2,7,3,9};
			
			for(int i=0;i<a.length;i++) {
				
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]>a[j]) {
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
				System.out.print(a[i]+" ");
			}
			
	
		}
	
	}
