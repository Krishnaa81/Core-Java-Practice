package conditions;
import java.util.*;

public class Print_Student_Details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Student Age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter Student Branch: ");
		String branch = sc.nextLine();
		
		System.out.print("Enter Student College Name: ");
		String collegename = sc.nextLine();
		
		System.out.println(" ");
		System.out.println("Student Details");
		System.out.println("---------------------------");
		
		System.out.println("Student Name is: "+name);
		System.out.println("Student Age is: "+age);
		System.out.println("Student Branch is: "+branch);
		System.out.println("Student College Name is: "+collegename);

	}

}
