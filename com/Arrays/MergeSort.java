package com.Arrays;
import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {	
	
	int[] arr = {6, 5, 4, 3};

    divide(arr);

     System.out.println("After sorting: " + Arrays.toString(arr));
	 }
      static void divide(int[] arr) {

      if (arr.length <= 1) {
		return;
		 }
       int[] left = new int[arr.length / 2];
       int[] right = new int[arr.length - left.length];

	for (int i = 0; i < left.length; i++) {
     left[i] = arr[i];
		}
	 for (int i = 0; i < right.length; i++) {
         right[i] = arr[left.length + i];
     }

     divide(left);
     divide(right);

     merge(arr, left, right);
 }
      static void merge(int[] arr, int[] left, int[] right) {

	        int i = 0;
	        int j = 0;
	        int k = 0;

	        while (i < left.length && j < right.length) {

	            if (left[i] < right[j]) {
	                arr[k++] = left[i++];
	            } else {
	                arr[k++] = right[j++];
	            }
	        }

	        while (i < left.length) {
	            arr[k++] = left[i++];
	        }

	        while (j < right.length) {
	            arr[k++] = right[j++];
	        }
	    }
	}



		   