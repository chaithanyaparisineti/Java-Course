package com.Arrays;
import java.util.Scanner;
public class ReadFromScanner {
	 public static boolean isprime(int a) {
		 boolean status=true;
		 if(a==0||a==1) {
			 return false;
		 }
		 for(int i=2;i<a;i++) {
			 if(a%i==0) {
				status=false;
				break;
			 }
		 }
		 return status;
	 }
	public static void main(String[] args) {
		System.out.println("main method started");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a size:");
			int size=sc.nextInt();
			int[]arr=new int[size];
			System.out.println("enter the elements:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("representing elements");
			for(int a:arr) {
				System.out.println(a);
			}
			
			
		 }
	}


