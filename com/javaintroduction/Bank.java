package com.javaintroduction;

public class Bank {
	static int account_no=1000;
	String customerName;
	double accountBalance;
	
	{
		System.out.println("instance called");
		account_no++;
	}
	
	void show() {
		System.out.println(account_no);
		System.out.println(customerName);
		System.out.println(accountBalance);
		System.out.println("--------------------------");
	}
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.customerName="krishna";
		b1.accountBalance=6788.00;
		b1.show();
		
		Bank b2=new Bank();
		b2.customerName="chaithanya";
		b2.accountBalance=4567.00;
		b2.show();
		
		Bank b3=new Bank();
		b3.customerName="sravan";
		b3.accountBalance=6000.00;
		b3.show();

	}

}
