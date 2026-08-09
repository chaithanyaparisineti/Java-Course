package AdditionPrograms;
import java.util.Scanner;
public class ZigZag {
static boolean isprime(int n) {
	if(n<2) {
		return false;
	}
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows:");
	int n=sc.nextInt();
	int num=1;
	for(int i=1;i<=n;i++) {
		int[]a=new int[i];
		int index=0;
		while(index<i) {
			if(!isprime(num)) {
				a[index]=num;
				index++;
			}
			num++;
			}
		if(i%2==1) {
			for (int j = 0; j < i; j++)
                System.out.print(a[j] + " ");
		}
		System.out.println();
	}
	}

}
