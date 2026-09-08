package com.Arrays;
public class kthLargest {
	public static void main(String[] args) {
		int[]arr= {10,5,20,8,15};
		int k=1;
		int[]temp=arr.clone();
		for(int i=0;i<k;i++) {
			int maxIndex=i;
			for(int j=i+1;j<temp.length;j++) {
				if(temp[j]>temp[maxIndex]) {
					maxIndex=j;
				}
			}
			int swap=temp[i];
			temp[i]=temp[maxIndex];
			temp[maxIndex]=swap;
		}
		 System.out.println("Kth Largest = " + temp[k - 1]);
	}

}
