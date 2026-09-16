package oopsConcepts;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double balance=10000;
	int choice;
	do {
		System.out.println("\n-----ATM MENU-----");
		System.out.println("1.checkBalance");
		System.out.println("2.deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("Enter your Choice: ");
		try {
			choice=sc.nextInt();
			switch(choice) {
			//check Balance
			case 1:
				System.out.println("Check Balance:Rs"+balance);
				break;
				
				//Deposit Amount
			case 2:
				System.out.println("Enter your Deposit Amount: ");
				 try {
                     double deposit = sc.nextDouble();
				if(deposit<0) {
					System.out.println("Error: Deposit amount cannot be Negative");
				}else if(deposit==0) {
					System.out.println("Deposit Amount cannot be Zero");
				}else {
					balance=balance+deposit;
					System.out.println("Amount deposited Successfully");
					System.out.println("updated balance:"+balance);
				}
				}catch (Exception e) {
                    System.out.println("Invalid numeric input!");
                    sc.nextLine();
				}
				 break;
				 
				 //With Draw
			case 3:
				System.out.println("Enter your Withdraw Amount: ");
				 try {
                     double Withdraw = sc.nextDouble();
				if(Withdraw<0) {
					System.out.println("Error: Withdraw amount cannot be Negative");
				}else if(Withdraw==0) {
					System.out.println("Withdraw Amount cannot be Zero");
				}else {
					balance=balance-Withdraw;
					System.out.println("Amount Withdraw Successfully");
					System.out.println("updated balance:"+balance);
				}
				}catch (Exception e) {
                    System.out.println("Invalid numeric input!");
                    sc.nextLine();
				}
				 break;
				 
			case 4:
				System.out.println("Thank You for visiting this ATM");
				
			default:
				System.out.println("Invalid chaoice please Select 1 to 4");
			}
		}catch (Exception e) {
            System.out.println("Invalid numeric input!");
            sc.nextLine();
            choice=0;
		}
	}while(choice!=4);
	
	sc.close();

	}

}
