package myprojectworkspace;
import java.util.Scanner;
public class ATMwithdrawal {

	public static void main(String[] args) {
		
		     Scanner sc = new Scanner(System.in);

		     int correctPin=1234;
		     double balance = 10000;
		     double dailyLimit = 5000;
		     int withdrawCount = 0;
		     String yn="";
do {
		     System.out.print("Enter PIN: ");
		     int pin = sc.nextInt();

		      if (pin == correctPin) {
		         System.out.print("Enter withdrawal amount: ");
		         double amount = sc.nextDouble();

		       if (amount <= dailyLimit) {
		          if (amount <= balance) {
		            balance = balance - amount;
		            withdrawCount++;  
		            System.out.println("Withdrawal Successful!");
		            System.out.println("Remaining Balance:" + balance);
		            System.out.println("Number of Withdrawals: " + withdrawCount);
		            } else {
		              System.out.println("Insufficient Balance.");
		           }
		            } 
		              else {
		                System.out.println("Daily Withdrawal Limit Exceeded.");
		            }
		        } else {
		            System.out.println("Invalid PIN Try Again.");
		            break;
		            
		        }
		            System.out.println("Do you want to continue..!click y for yes n for No");
		            System.out.println("***************************************");
		   		 yn=sc.next();
		   	   }while(yn.equalsIgnoreCase("y"));
		   	   System.out.println("No");
		   	System.out.println("Total Successful Withdrawals: " + withdrawCount);


		        sc.close();
}
	}

	


