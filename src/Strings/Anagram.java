package Strings;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="abcd".toLowerCase();
		String s2="dcba".toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		int count[]=new int[26];
		
		
		for(int i=0;i<s1.length();i++) {
			
			count[s1.charAt(i)-'a']++;
			
		}
		
		for(int i=0;i<s2.length();i++) {
			count[s2.charAt(i)-'a']--;
		}
		
		boolean isAnagram = true;
		
		for(int i=0;i<26;i++) {
			if(count[i] !=0) {
				isAnagram=false;
				break;
			}
		}
			
			if(isAnagram) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not a Anagram");
			}
			

	}

}
