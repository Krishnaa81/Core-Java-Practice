package Constructors;

public class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        accountNumber = 1001;
        holderName = "Krishna";
        balance = 10000;
    }

    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Balance after Deposit : "+balance);
    }

    void withdraw(double amount){
        balance -= amount;
        System.out.println("Balance after Withdraw : "+balance);
    }

    void checkBalance(){
        System.out.println("Current Balance : "+balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.deposit(2000);
        b.withdraw(1000);
        b.checkBalance();
    }
}