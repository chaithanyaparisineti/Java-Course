package com.Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int[]arr= {10,45,23,67,12};
		int smallest=arr[0];
		for(int i=0;i>arr.length;i++) {
		if (arr[i] < smallest) {
			smallest=arr[i];
		}
	}
		System.out.print("smallest:"+smallest);
}
}
