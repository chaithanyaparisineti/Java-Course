package com.Arrays;

public class LargestElement {

	public static void main(String[] args) {
	int[]arr= {10,45,23,67,12};
	int largest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if (arr[i] > largest) {
		largest=arr[i];
	}
	}
	System.out.print("largest:"+largest);
	}
}
