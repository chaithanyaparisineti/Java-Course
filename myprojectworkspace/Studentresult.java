package myprojectworkspace;
import java.util.Scanner;


public class Studentresult {


		    public static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
		        return m1 + m2 + m3 + m4 + m5;
		    }

		    public static double calculatePercentage(int total) {
		        return (total / 500.0) * 100;
		    }

		    public static double calculateAverage(int total) {
		        return total / 5.0;
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter marks of 5 subjects:");

		        System.out.print("Subject 1: ");
		        int m1 = sc.nextInt();

		        System.out.print("Subject 2: ");
		        int m2 = sc.nextInt();

		        System.out.print("Subject 3: ");
		        int m3 = sc.nextInt();

		        System.out.print("Subject 4: ");
		        int m4 = sc.nextInt();

		        System.out.print("Subject 5: ");
		        int m5 = sc.nextInt();

		        int total = calculateTotal(m1, m2, m3, m4, m5);
		        double percentage = calculatePercentage(total);
		        double average = calculateAverage(total);

		        System.out.println("\n------ Student Result ------");
		        System.out.println("Total Marks : " + total);
		        System.out.println("Percentage  : " + percentage + "%");
		        System.out.println("Average     : " + average);

		        sc.close();
		    }
		

	}


