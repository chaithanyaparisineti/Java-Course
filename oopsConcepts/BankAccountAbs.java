package oopsConcepts;
abstract class Account{
	static void BankName(){
		System.out.println("***Bank Name : SSS Bank***");
	}
	//concrete Method
	void AccountType() {
		System.out.println("Account Type: Savings Account");
	}
	abstract void intrestRate();	
}
class SavingsAccount extends Account{
	@Override
	void intrestRate() {
		System.out.println("Savings Account IntrestRate is 5%");
	}	
//concrete method
void AccountType() {
	System.out.println("Account Type: Current Account");
}
}
class CurrentAccount extends Account{
	@Override
	void intrestRate() {
		System.out.println("Current Account IntrestRate is 4%");	
	}	
}
public class BankAccountAbs {
	public static void main(String[] args) {
		Account.BankName();
		Account A1=new SavingsAccount();
		Account A2=new CurrentAccount();
		A1.AccountType();
		A2.intrestRate();
		System.out.println("********************************");
		A2.AccountType();
		A1.intrestRate();
	}

}
