package ExceptionHandling;
import java.util.Scanner;
public class TestEH9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		String s1=sc.nextLine();
		
		System.out.println("Enter a number:");
		String s2=sc.nextLine();
		
		try {
			int num1=Integer.parseInt(s1);
			int num2=Integer.parseInt(s2);
			
			int result=num1/num2;
			System.out.println("Result:"+result);
		}
		catch(NumberFormatException e){
			System.out.println("invalid Number");
		}catch(ArithmeticException e) {
			System.out.println("cannot divided by Zero");
		}
		int[]arr= {10,20,30,40,50};
		System.out.println("Enter a Index of array:");
		int index=sc.nextInt();
		
		try {
			  System.out.println("Element = " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
		sc.close();
		}

	}


