package myprojectworkspace;
import java.util.Scanner;
public class GradeDetails {
	static String getgradedetails(String grade) {
		String gradedetails=switch(grade) {
		case "A"-> {
			System.out.println("more than 90%");
		   yield  "excellent";
		}
		case "B"-> {
			System.out.println("more than 80%");
		   yield  "good";
		}
		case "C"-> {
			System.out.println("more than 70%");
		   yield  "Average";
		}
		case "D"-> {
			System.out.println("more than 60%");
		   yield  "Better";
		}
		case "E"-> {
			System.out.println("more than 50%");
		   yield  "pass";
		}
		default-> "failed";
		};
		
		return gradedetails;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade:");
		String grade=sc.next();
		
		String details=getgradedetails(grade);
		System.out.println("gradedetails:"+details);


	}

}
