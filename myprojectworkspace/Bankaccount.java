package myprojectworkspace;

public class Bankaccount {
	String HolderName;
	double accountNumber;
	int balance;
	Bankaccount(String HolderName,double accountNumber,int balance){
		this.HolderName=HolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	Bankaccount(Bankaccount b){
		this.HolderName=b.HolderName;
		this.accountNumber=b.accountNumber;
		this.balance=b.balance;
		
	}
	void display() {
		System.out.println("HolderName="+HolderName);
		System.out.println("accountNumber="+accountNumber);
		System.out.println("balance="+balance);
		System.out.println("****************************************");
	}
	void deposit() {
		this.balance=balance+5000;
	}

	public static void main(String[] args) {
		Bankaccount b=new Bankaccount("chaithanya",8125200535.00,250000);
		b.display();
		Bankaccount b1=new Bankaccount(b);
		b1.deposit();
		b1.display();
        
	}

}
