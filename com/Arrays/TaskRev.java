package com.Arrays;
public class TaskRev {
	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15,16};
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int rev=0;
			while(n>0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.print(rev);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		
System.out.println("}");
	}

}
