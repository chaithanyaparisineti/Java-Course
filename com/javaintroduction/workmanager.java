package com.javaintroduction;

public class workmanager {
	static int account_no=1215;
	String customerName;
	double accountBalance;
	{
		System.out.println("main method called");
		account_no++;
	}
	void show(){
	System.out.println(account_no);
	System.out.println(customerName);
	System.out.println(accountBalance);
	}

	public static void main(String[] args) {
		workmanager b1=new workmanager();
		b1.customerName="chaithanya";
		b1.accountBalance=1512.00;
		b1.show();
		workmanager b2=new workmanager();
		b2.customerName="chaithanya";
		b2.accountBalance=1512.00;
		b2.show();



	}

}
