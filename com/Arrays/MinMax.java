package com.Arrays;

public class MinMax {

	public static void main(String[] args) {
	int[]numbers= {10,8,6,4,2,9,7,5,3};
	int min=numbers[0];
	int max=numbers[0];
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]<min) {
			min=numbers[i];
		}else if(numbers[i]>max) {
			max=numbers[i];
		}
	}
	System.out.println("min value is:"+min);
	System.out.println("max value is:"+max);

	}

}
