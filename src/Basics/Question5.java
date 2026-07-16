package Basics;
import java.util.*;
public class Question5 {
	
	public static void deposit(double balance,double amount) {
		double deposit = balance+amount;
		System.out.println("Balance after deposit: "+deposit);
	}
	
	public static void withdraw(double balance, double amount) {
		double withdraw = balance-amount;
		System.out.println("Balance after withdraw: "+withdraw);
	}
	
	public static void checkbalance(double balance) {
		System.out.println("Check balance: "+balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter inintial amount: ");
		double balance = sc.nextDouble();
		
		System.out.println("Enter deposit amount: ");
		double depositamount = sc.nextDouble();
		
		System.out.println("Enter withdraw amount: ");
		double withdrawamount = sc.nextDouble();
		
		deposit(balance,depositamount);
		balance = balance+depositamount;
		withdraw(balance,withdrawamount);
		balance=balance-withdrawamount;
		checkbalance(balance);
		
		

	}

}
