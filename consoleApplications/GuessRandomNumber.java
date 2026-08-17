package consoleApplications;
import java.util.Random;
import java.util.Scanner;
public class GuessRandomNumber {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the number:");
         int input = sc.nextInt();
         int attempts = 0;
	     boolean correct = false;
	 for (int i = 0; i < 3; i++) {
	    System.out.println("Enter your guess:");
	      int num = sc.nextInt();
	        attempts++;
	      if (num == input) {
	          System.out.println("Yes! Your guess is correct.");
	          correct = true;
	           break;
	         } else {
	            System.out.println("Wrong guess!");
	          }
	            System.out.println("Attempts: " + attempts);
	        }

	        if (!correct) {
	            System.out.println("No! Your guesses are wrong.");
	        }

	        sc.close();
	    }
	}