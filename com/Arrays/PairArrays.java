package com.Arrays;

public class PairArrays {

	public static void main(String[] args) {
	int[]arr= {2,3,6,8,9,11,13,12};
	int target=15;
	int left=0;
	int right=arr.length-1;
	boolean status=false;
	while(left<right) {
		int sum=arr[left]+arr[right];
		if(sum==target) {
			System.out.println(arr[left]+"+"+arr[right]+"-"+sum);
			status=true;
			left++;
			right--;
		}else if(sum<target) {
			left++;
		}else {
			right--;
		}
	}

	}

}
