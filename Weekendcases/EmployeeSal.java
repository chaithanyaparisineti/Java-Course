package Weekendcases;
import java.util.Scanner;
public class EmployeeSal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int n=sc.nextInt();
		Double highest=Double.MIN_VALUE;
		Double lowest=Double.MAX_VALUE;
		Double total=(double) 0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter salary of employee"+ i +":");
			double salary=sc.nextDouble();
			total=total+salary;
			if(salary>highest) {
				highest=salary;
			}
			if(salary<lowest) {
				lowest=salary;
			}
		}
		double average=total/n;
		System.out.println("salary report");
		System.out.println("Highest salary:"+highest);
		System.out.println("Lowest salary:"+lowest);
		System.out.println("total salary:"+total);
		System.out.println("Average salary:"+average);

	}

}
