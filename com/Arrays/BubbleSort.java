package com.Arrays;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
	int[]arr= {1,3,6,7,9,2,4};
	int temp=0;
	int count=0;
	int count1=0;
	boolean flag=false;
	for(int i=0;i<arr.length-1;i++) {
		count++;
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
			count1++;
		}
		if(!flag) {
			break;
				}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(count);
	System.out.println(count1);
	}
}


