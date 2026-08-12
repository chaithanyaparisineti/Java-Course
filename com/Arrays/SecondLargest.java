package com.Arrays;
public class SecondLargest {
	public static void main(String[] args) {
		int[]arr= {10,50,20,40,30};
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > largest) {
				largest=secondlargest;
				largest=arr[i];
			}else if(arr[i]>secondlargest&&arr[i]!=largest) {
				secondlargest=arr[i];
			}
		}
		System.out.print("secondlargest:"+secondlargest);
		}
	
	}

