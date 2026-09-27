package com.Arrays;
public class TaskSum {
	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	int newArr[]=new int[arr.length];
	newArr[0]=arr[0]+arr[1];
	for(int i=1;i<arr.length;i++) {
		newArr[i]=arr[i]+arr[i-1];
	}
	System.out.print("{");
	for(int i=0;i<newArr.length;i++) {
		System.out.print(newArr[i]);
		
		if(i<newArr.length-1) {
		System.out.print(",");
	}
	}
	System.out.println("}");
	}

}
