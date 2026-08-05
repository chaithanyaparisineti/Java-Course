package LoopingStatements;
import java.util.Scanner;
public class swapDigits {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
      int temp=n;
      int lastdigit=n%10;
      
      int firstdigit=0;
      int digits=0;
      
      while(temp>0) {
    	  firstdigit=temp;
    	  temp=temp/10;
    	  digits++;
      }
      int power=1;
      for(int i=1;i<digits;i++) {
    	  power*=10;
      }
    	  int middle=(n%power)/10;
    	  int result = lastdigit * power + middle * 10 + firstdigit;

          System.out.println("After swapping: " + result);

      }
	}


