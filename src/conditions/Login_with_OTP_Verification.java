package conditions;

import java.util.Scanner;

public class Login_with_OTP_Verification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String username = sc.nextLine();
		String password = sc.nextLine();
		int otp = sc.nextInt();
		
		if(username .equals("krishnaa")) {
			if(password .equals("krishna@000")) {
				if(otp == 1432) {
					System.out.println("Login Successful");
				}else {
					System.out.println("invalid otp");
				}
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("invalid username");
		}

	}

}
