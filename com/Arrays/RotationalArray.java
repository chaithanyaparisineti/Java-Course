package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class RotationalArray {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8};
	Scanner sc=new Scanner(System.in);
	System.out.println("main method Started");
	System.out.println("enter a number:");
	int r=sc.nextInt();
	arrrotation(arr,r);
	System.out.println("After sorting:");
	System.out.println(Arrays.toString(arr));
	}

	 static void arrrotation(int[] arr, int r) {
		 r=r%arr.length;
		 int Start=0;
			int end =arr.length-1;
			reversearray(arr,Start,end);
			reversearray(arr,Start,r-1);
			reversearray(arr,r,end);		
	}

	 static void reversearray(int[] arr, int Start, int end) {

		 while (Start < end) {
		        int temp = arr[Start];
		        arr[Start] = arr[end];
		        arr[end] = temp;

		        Start++;
		        end--;
		    }
		
	}

}


