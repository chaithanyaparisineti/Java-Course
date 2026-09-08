package com.Arrays;
public class CircularArraySum {
	public static void main(String[] args) {
		int[] code = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int n = code.length;
        int[] result = new int[n];
        // Calculate first window
        int sum = 0;
        for (int j = 1; j <= k; j++) {
            sum += code[j % n];
        }
        result[0] = sum;
        // Sliding window
        for (int i = 1; i < n; i++) {
            // Remove old element
            sum -= code[i % n];
            // Add new element
            sum += code[(i + k) % n];
            result[i] = sum;
        }
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

	}

}
