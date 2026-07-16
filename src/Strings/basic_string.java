package Strings;

public class basic_string {

	public static void main(String[] args) {
		
//		String s1 ="aaa";
//		String s2="abb";
//		
//		if(s1.length() != s2.length()) {
//			System.out.println("not anagram");
//			return;
//		}
//		
//		int count=0;
//		
//		for(int i=0;i<s1.length();i++) {
//			for(int j=0;j<s2.length();j++) {
//				
//				if(s1.charAt(i)==s2.charAt(j)) {
//					count++;
//					break;
//				}
//			}
//		}
//				if(count==s1.length()) {
//					System.out.println("String is a Anagram");
//				}else {
//					System.out.println("String is not a Anagram");
//					
//				
//			
//		}
		
	String s="DDD".toLowerCase();
		String s1="DDD".toLowerCase();
//		
//		
//		if (s.length()!=s1.length()) {
//			System.out.println("NOT Angaram:");
//			return;
//		}
//		
//		
//		
//		
//		int count1 [] = new int[26];
//		int count2 [] = new int[26];
//		
//		
//		for(int i=0; i<s.length(); i++) {
//			
//			count1[s.charAt(i)-'a']++;
//			count2[s1.charAt(i)-'a']++;
//			
//		}
//		
//		boolean isangarm=true;
//		
//		for(int i=0; i<26; i++) {
//			
//			if(count1[i]!=count2[i]) {
//				isangarm = false;
//				break;
//				
//			}
//			
//		}
//		
//		if(isangarm) {
//			System.out.println("It is a angarm:");
//		}
//		else {
//			System.out.println("It is not a angarm:");
//		}
	
		
		if (s.length() != s1.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int count[] = new int[26];

        // First loop: increment
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Second loop: decrement
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is not an Anagram");
        }
		
		
	}

}
