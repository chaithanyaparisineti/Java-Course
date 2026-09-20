package ExceptionHandling;

import java.util.Scanner;

public class TestEH10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance Amount:");
        int balance = sc.nextInt();

        System.out.println("Enter withdraw Amount:");
        int withdraw = sc.nextInt();

        // ArithmeticException
        try {
            if (withdraw == 0) {
                throw new ArithmeticException();
            }

            if (withdraw > balance) {
                throw new ArithmeticException();
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Withdrawal amount cannot be Zero or greater than balance");
        }

        // NumberFormatException
        try {
            String amount = "abc";

            double withdrawAmount = Double.parseDouble(amount);

            System.out.println("Entered Amount: " + withdrawAmount);

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount Entered");
        }

        // ArrayIndexOutOfBoundsException
        try {
            String[] history = {"Deposit", "Withdraw", "Deposit"};

            System.out.println("Enter transaction index:");
            int index = sc.nextInt();

            System.out.println("Transaction: " + history[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid transaction index");
        }

        // NullPointerException
        try {
            String name = null;

            System.out.println("Account Holder: " + name.toUpperCase());

        } catch (NullPointerException e) {
            System.out.println("Account details are not available");
        }

        System.out.println("ATM Program Completed");

        sc.close();
    }
}