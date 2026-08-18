package com.Arrays;
import java.util.Arrays;
public class InsertionArray {
	public static void main(String[] args) {
		int[]arr= {5,6,3,1,2,7};
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0&&arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		 System.out.println("After sorting:");
	        System.out.println(Arrays.toString(arr));
	}

}
