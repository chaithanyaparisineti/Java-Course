package com.Arrays;
import java.util.Scanner;
public class SearchElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {10,20,30,40,50};
		System.out.println("enter a number to search:");
		int number=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==number) {
				System.out.println(number+"is present at index"+i);
						break;
			}
		}
	}

}
