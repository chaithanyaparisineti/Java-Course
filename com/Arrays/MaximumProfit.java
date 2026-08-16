package com.Arrays;
import java.util.Scanner;
public class MaximumProfit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);r
		int[] arr = {7, 1, 5, 3, 6, 4};

        int buy = arr[0];
        int maxProfit = 0;
        int buyPrice = 0;
        int sellPrice = 0;

        for (int i = 1; i < arr.length; i++) {
           
            if (arr[i] < buy) {
                buy = arr[i];
            }

            int profit = arr[i] - buy;

            if (profit > maxProfit) {
                maxProfit = profit;
                buyPrice = buy;
                sellPrice = arr[i];
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
        System.out.println("Buy at: " + buyPrice);
        System.out.println("Sell at: " + sellPrice);
        System.out.println("Profit: " + maxProfit);
    }
}		
