package com.Arrays;

public class RowsAndColoumsZeroes {

	public static void main(String[] args) {
		int[][]arr= {{1,1,0},{1,1,1},{0,1,0}};
		boolean []rows=new boolean[arr.length];
		boolean[]cols=new boolean[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					rows[i]=true;
					cols[j]=true;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(rows[i]||cols[j]) {
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();

	}

}
