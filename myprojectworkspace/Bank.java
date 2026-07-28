package myprojectworkspace;

public class Bank {
	Double Balance=10000.00;
	
	void method() {
		System.out.println(Balance);
	}
	void deposite(Double Amount){
		
		Balance=Balance+Amount;
	    System.out.println(Balance);

	}
void withdraw(Double Amount) {
	
	Balance=Balance-Amount;
	System.out.println(Balance);
}
void displayBalance() {
	System.out.println("Balance:"+Balance);
}
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.method();
		b1.deposite(5000.00);
		b1.method();
		b1.withdraw(10000.00);
		b1.displayBalance();
		

	}
}
