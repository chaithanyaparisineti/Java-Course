package myprojectworkspace;
import java.util.Scanner;
public class JobApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your candidatedetails:");
		System.out.println("Name of candidate:");
		String name=sc.nextLine();
		System.out.println("Name of college:");
		String clgname=sc.nextLine();
		System.out.println("enter Branch:");
		String Branch=sc.nextLine();
		System.out.println("enter year of passing:");
		int yop=sc.nextInt();
		System.out.println("cgpa secured:");
		double cgpa=sc.nextDouble();
	
		System.out.println("address:");
		String address=sc.next();
		
		System.out.println("country:");
		String country=sc.next();
		
		System.out.println("state:");
		String state=sc.next();
		
		System.out.println("skills:");
		String skills=sc.next();
		
		System.out.println("Experience:");
		int Experience=sc.nextInt();
		
		System.out.println("Work location: ");
		String Worklocation=sc.next();
	
		if (yop>=2026) {
			System.out.println("you are eligible");	
		}else {
			System.out.println("you are not eligible");
		}
			if(cgpa>=7.5) {
				System.out.println("you are eligible");	
			}else {
				System.out.println("you are not eligible");
		}
			if(Experience>=1) {
				System.out.println("you are not eligible");
			}else {
				System.out.println("you are not eligible");
	}
	
	}
}

