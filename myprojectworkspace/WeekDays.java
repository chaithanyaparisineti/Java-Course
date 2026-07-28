package myprojectworkspace;
import java.util.Scanner;
public class WeekDays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started");
		System.out.println("week days");
		int days=sc.nextInt();
		switch(days) {
		case 1 ->{
			System.out.println("Sunday");
			System.out.println("sunday is always funday");
		}
		case 2 -> System.out.println("Monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("Saturday");
		default ->System.out.println("Invalid Day");


	}

}
}