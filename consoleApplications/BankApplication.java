package consoleApplications;
//Abstract class
abstract class BankAccount implements BankOperations {

private int accountNumber;
private String accountHolder;
protected double balance;

// Constructor
BankAccount(int accountNumber, String accountHolder, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
}
void displayAccountDetails() {
    System.out.println("Account Number : " + accountNumber);
    System.out.println("Account Holder : " + accountHolder);
    System.out.println("Balance        : " + balance);
}

// Abstract method
abstract void calculateInterest();
}
//Savings Account
class SavingsAccount extends BankAccount {

SavingsAccount(int accountNumber, String accountHolder, double balance) {
    super(accountNumber, accountHolder, balance);
}

@Override
public void deposit(double amount) {
    if (amount > 0) {
        balance = balance + amount;
        System.out.println("Amount Deposited : " + amount);
    } else {
        System.out.println("Invalid deposit amount");
    }
}

@Override
public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance = balance - amount;
        System.out.println("Amount Withdrawn : " + amount);
    } else {
        System.out.println("Insufficient balance or invalid amount");
    }
}

@Override
public void checkBalance() {
    System.out.println("Current Balance : " + balance);
}

@Override
void calculateInterest() {
    double interest = balance * 0.04;
    System.out.println("Savings Interest : " + interest);
}
}

//Current Account
class CurrentAccount extends BankAccount {

CurrentAccount(int accountNumber, String accountHolder, double balance) {
    super(accountNumber, accountHolder, balance);
}

@Override
public void deposit(double amount) {
    if (amount > 0) {
        balance = balance + amount;
        System.out.println("Amount Deposited : " + amount);
    } else {
        System.out.println("Invalid deposit amount");
    }
}

@Override
public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance = balance - amount;
        System.out.println("Amount Withdrawn : " + amount);
    } else {
        System.out.println("Insufficient balance or invalid amount");
    }
}

@Override
public void checkBalance() {
    System.out.println("Current Balance : " + balance);
}

@Override
void calculateInterest() {
    System.out.println("Current Account has no interest.");
}
}


public class BankApplication {

	public static void main(String[] args) {
		 // Polymorphism
        BankAccount savings = new SavingsAccount(101,"Chaithanya",10000);

        System.out.println("===== SAVINGS ACCOUNT =====");

        savings.displayAccountDetails();

        savings.deposit(5000);

        savings.withdraw(2000);

        savings.checkBalance();

        savings.calculateInterest();

        System.out.println();

        BankAccount current = new CurrentAccount( 102,"Noor", 20000);

        System.out.println("===== CURRENT ACCOUNT =====");

        current.displayAccountDetails();

        current.deposit(10000);

        current.withdraw(5000);

        current.checkBalance();

        current.calculateInterest();
    }
}