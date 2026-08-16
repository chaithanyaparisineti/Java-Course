package com.Arrays;
import java.util.Arrays;
public class mergeSortTask {
	public static void main(String[] args) {
		int[]arr1= {1,4,7,10};
		int[]arr2= {2,3,9};
		int[]result=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k]=arr1[i];
				i++;
			}else {
				result[k]=arr1[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			result[k]=arr1[i];
			i++;
			k++;
			}
		while(j<arr2.length) {
			result[k]=arr1[j];
			j++;
			k++;
		}
		System.out.println("merged array:"+ Arrays.toString(result));
		System.out.println("array 1:"+ Arrays.toString(arr1));
		System.out.println("array 2:"+ Arrays.toString(arr2));
	}
	
	
	}



