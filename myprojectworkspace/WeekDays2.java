package myprojectworkspace;
import java.util.Scanner;
public class WeekDays2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main meethod Started");
		System.out.println("enter a Day:");
		String day=sc.next().toLowerCase();
		switch(day) {
		case "sunday"->System.out.println("funday");
		case "monday"->System.out.println("week start");
		case "tuesday"->System.out.println("exiting");
		case "wednesday","thursday"->System.out.println("daily routine days");
		case "friday"->System.out.println("colourful day");
		case "saturday"->System.out.println("Week end ");
		default->System.out.println("invalid day");
		}

	}

}
