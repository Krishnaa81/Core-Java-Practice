package conditions;

import java.util.Scanner;

public class Login_System_Nested_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter user name: ");
		String username = sc.nextLine();
		
		System.out.print("Enter Password: ");
		String password  = sc.nextLine();
		
		if(username .equals("krishnaa")) {
			 if(password .equals("krishna@000")) {
				 
			System.out.println("Login Successful");
			 }
			 else {
				 System.out.println("Invalid password");
			 }
		}
		
		else if(username != "krishnaa"){
			System.out.println("Invalid user name");
			
		}
	}

}
