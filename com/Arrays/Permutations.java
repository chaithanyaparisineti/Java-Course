package com.Arrays;

import java.util.Arrays;

public class Permutations {
	static void permutation(int[]arr,int index) {
		if(index==arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=index;i<arr.length;i++) {
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			
			permutation(arr,index+1);
			
			temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        permutation(arr, 0);
    }
	}


