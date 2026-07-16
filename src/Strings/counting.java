package Strings;

public class counting {

	public static void main(String[] args) {
		
		String s = "programming";
		
		for(int i=0;i<s.length();i++) {
			 boolean isduplicate=false;
			 
			 for(int j=0;j<i;j++) {
				 if(s.charAt(i)==s.charAt(j)) {
					 isduplicate=true;
					 break;
				 }
			 }
			 if(isduplicate) {
				 continue;
			 }
			 int count=0;
			 for(int k=0;k<s.length();k++) {
				 if(s.charAt(i)==s.charAt(k)) {
					 count++;
				 }
				 
			 }
			 System.out.println(s.charAt(i)+": "+count);
		}

	}

}
