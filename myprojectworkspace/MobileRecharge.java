package myprojectworkspace;
import java.util.Scanner;
public class MobileRecharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double walletBalance = 500;

        System.out.print("Enter Recharge Plan Amount: ");
        double plan = sc.nextDouble();

        if (plan == 199 || plan == 299 || plan == 399) {
            if (walletBalance >= plan) {
                walletBalance = walletBalance - plan;
                System.out.println("Recharge Successful!");
                System.out.println("Remaining Wallet Balance: ₹" + walletBalance);
            } else {
                System.out.println("Insufficient Wallet Balance.");
            }
        } else {
            System.out.println("Invalid Recharge Plan.");
        }

        sc.close();
    }


	}


