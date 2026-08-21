package com.Arrays;
import java.util.Scanner;
public class PositionOfGivemmatrix {
static Scanner sc=new Scanner(System.in);
static void positionMatrix(int[][]arr,int num) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==num) {
			System.out.println("Number "+num +
		                  "row:" + i);
			System.out.println( "Number"+"coloumn: " + j);        	
				}
		}
	}
}
	public static void main(String[] args) {
	int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println("Enter a Number:");
	int num1=sc.nextInt();

	positionMatrix(arr,num1);


	}

}
