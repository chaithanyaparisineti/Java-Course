package com.Arrays;
public class MinMaxMatrix {
	public static void main(String[] args) {
		int[][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int max=arr[0][0];
		int min=arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				if(arr[i][j]>min) {
					max=arr[i][j];
				}	
			}
		}
		System.out.println("The largest element:"+max);
		System.out.println("The smallest element:"+min);

	}

}
