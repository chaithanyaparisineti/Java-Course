package AdditionPrograms;
import java.util.Scanner;
public class RomanNumINT {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        int sum=0;
	        for(int i=0;i<s.length();i++){

	            int current=value(s.charAt(i));

	            if(i<s.length()-1){

	                int next=value(s.charAt(i+1));

	                if(current<next)
	                    sum-=current;
	                else
	                    sum+=current;
	            }
	            else{
	                sum+=current;
	            }
	        }
	        System.out.println(sum);
	    }
	    static int value(char ch){

	        switch(ch){

	            case 'I': return 1;
	            case 'V': return 5;
	            case 'X': return 10;
	            case 'L': return 50;
	            case 'C': return 100;
	            case 'D': return 500;
	            case 'M': return 1000;
	        }

	        return 0;
	}

}
