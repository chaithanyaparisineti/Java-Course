package myprojectworkspace;
import java.util.Scanner;
public class MovieHeros {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Main method started");
		System.out.println("enter tollywood heros");
		int name=sc.nextInt();
		switch(name) {
		case 12:
			System.out.println("Allu Arjun");
			System.out.println("National Award Winner");
			System.out.println("Icon star");
			break;
		case 15:
			System.out.println("Nani");
			System.out.println("The paradise");
			System.out.println("Natural Star");
			break;
		case 24:
			System.out.println("Vijay");
			System.out.println("CM of tamilnadu");
			System.out.println("Thalapathy");
			break;
		
		}
		sc.close();

	}

}
