package Weekendcases;
import java.util.Scanner;
public class OnlineExam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalQuestions = 20;
        int attemptedCount = 0;
        int totalMarks = 0;

        System.out.println("Enter the students response for 20 questions:");
        System.out.println("1 -> Correct answer | 0 -> Incorrect answer | -1 -> Not attempted");

        for (int i = 1; i <= totalQuestions; i++) {
            System.out.print("Question " + i + ": ");
            int response = sc.nextInt();
            if (response == 1) {
                attemptedCount++;
                totalMarks += 1; 
            } else if (response == 0) {
                attemptedCount++; 
            } else if (response == -1) {
                continue;
            } else {
                System.out.println("Invalid input! Question " + i + " skipped.");
            }
        }
        double percentage = ((double) totalMarks / totalQuestions) * 100;
        System.out.println("***** Exam Results*****");
        System.out.println("Total number of attempted questions: " + attemptedCount);
        System.out.println("Total marks scored: " + totalMarks);
        System.out.println("Percentage (out of 20 marks): " + percentage + "%");

        sc.close();

		 	}
}