package Weekendcases;
import java.util.Scanner;
public class EcommerceOrderProcessing {
	static int singleTransactionProfit(int[]prices) {
		int minprice=prices[0];
		int maxprofit=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<minprice) {
				minprice=prices[i];
			}else {
				maxprofit=Math.max(maxprofit, prices[i]-minprice);
			}
		}
		return maxprofit;	
	}
	static int multipleTransactionProfit(int[]prices) {
		int profit=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<prices[i-1]) {
				profit+=prices[i]-prices[i-1];
			}
		}
		return profit;	
	}
	static int ProfitwithFee(int[]prices,int fee) {
		int buy=-prices[0];
		int sell=0;
		for(int i=1;i<prices.length;i++) {
			buy=Math.max(buy,sell-prices[i]);
			sell=Math.max(sell, buy+prices[i]-fee);
			}
		
		return sell;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days:");
		int n=sc.nextInt();
		int[]prices=new int[n];
		System.out.println("Enter daily product profit prices:");
		for(int i=0;i<n;i++) {
			prices[i]=sc.nextInt();
		}
		System.out.println("Enter transaction fee:");
		int fee=sc.nextInt();
		System.out.println("*******E-commernce order processing*********");
		
		System.out.println("1.MaximumProfit(single Transaction)"+singleTransactionProfit(prices));
		System.out.println("2.MaximumProfit(multiple Transaction)"+multipleTransactionProfit(prices));
		System.out.println("3.MaximumProfit(multiple Transaction)"+ProfitwithFee(prices,fee));
		sc.close();
	}

}
