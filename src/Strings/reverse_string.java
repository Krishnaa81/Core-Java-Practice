package Strings;

public class reverse_string {

	public static void main(String[] args) {
		
		String s = "java is easy";
		
		String words[] = s.split(" ");

		for(int i=0;i<words.length;i++) {
			
			for(int j=words[i].length()-1;j>=0;j--) {
				
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
