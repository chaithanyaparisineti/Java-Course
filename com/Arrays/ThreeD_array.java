package com.Arrays;

public class ThreeD_array {

	public static void main(String[] args) {
		int[][][]arr=new int[3][3][3];
		
		arr[0][0][0]=101;
		arr[0][0][1]=102;
		arr[0][0][2]=103;
		
		arr[1][1][0]=101;
		arr[1][1][1]=102;
		arr[1][1][2]=103;
		
		arr[2][2][0]=101;
		arr[2][2][1]=102;
		arr[2][2][2]=103;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++ ) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");	
				}
				System.out.println();
			}
			System.out.println();
			}
			
		}
		
		
}
