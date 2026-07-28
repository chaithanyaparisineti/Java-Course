package myprojectworkspace;
import java.util.Scanner;
public class SwitchCaseoperators {
   public static void main(String[] args) {
	   String yn="";
	   do {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		double a=sc.nextInt();
		System.out.println("enter second number:");
		double b=sc.nextInt();
		System.out.println("enter symbol to proceed like + * - / %");
		String symb=sc.next();
		double Result=0;
		switch(symb) {
		case "+" ->Result=a+b;
		case "-" ->Result=a-b;
		case "*" ->Result=a*b;
		case "/" ->Result=a/b;
		case "%" ->Result=a%b;
		default->{
			System.out.println(0);
			System.out.println("invalid symbol to proceed");
			
		}
		}
		System.out.print("Result:"+Result);
		
		System.out.println("do you want to continue!click y for yes n for exist");
		 yn=sc.next();
	   }while(yn.equalsIgnoreCase("y"));
	   System.out.println("exist");
	   
   }
	   
}