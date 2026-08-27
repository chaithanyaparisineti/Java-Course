package oopsConcepts;

public class ATMaccount {
	private double balance;
	
	public void balance(double balance) {
		this.balance=balance;
	}
	public void ATMaccountdeposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount deposited:"+amount);
		}else {
			System.out.println("deposited amount must be greater than 0");
		}
	}
	public void ATMaccountwithdraw(double amount) {
		if(amount<=0) {
			System.out.println("withdrawl amount must be greater than 0");
		}else if(amount>balance){
			System.out.println("insufficient balance");
		}	else {
			balance=balance-amount;
			System.out.println("Amount withdrawal:"+amount);
		}
	}
	public void ATMaccountcheckBalance() {
		System.out.println("current Balance:"+balance);
	}

public static void main(String[]args) {
	ATMaccount A1=new ATMaccount();
	A1.balance(1000);
	A1.ATMaccountdeposit(10);
	A1.ATMaccountwithdraw(5);
	A1.ATMaccountcheckBalance();
}
}

