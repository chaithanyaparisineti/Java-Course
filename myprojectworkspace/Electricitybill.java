package myprojectworkspace;
import java.util.Scanner;
public class Electricitybill {
	void calculationBill() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name=s1.nextLine();
		System.out.println("Enter the consumed of units:");
		int units=s1.nextInt();
		int fixedRate=5;
		double Bill=units*fixedRate;
		System.out.println("customer name:"+name);
		System.out.println("consumed units:"+units);
		System.out.println("total bill:"+Bill);
	}

	public static void main(String[] args) {
		Electricitybill b1=new Electricitybill();
		b1.calculationBill();
		

	}

}
