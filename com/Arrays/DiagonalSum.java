package com.Arrays;

public class DiagonalSum {
	static void DiagonalSum(int[][]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("Diagonal Sum of given elements:"+sum);
	}

	public static void main(String[] args) {
		int[][]sum={ {1,2,3},{4,5,6},{7,8,9}};
		DiagonalSum(sum);
	}

}
