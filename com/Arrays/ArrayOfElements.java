package com.Arrays;

public class ArrayOfElements {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] numbers;
		numbers=new int[5];
		numbers[0]=15;
		numbers[1]=20;
		numbers[2]=30;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("main method ended");
	}

}
